package com.finoverse.service.impl;
import com.finoverse.service.ImageFactory;
import com.finoverse.utils.ImageViewer;
import com.finoverse.utils.MyLineRegression;
import org.opencv.calib3d.Calib3d;
import org.opencv.core.*;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.*;
import static org.opencv.core.Core.*;
import static org.opencv.highgui.Highgui.imread;
import org.opencv.features2d.DMatch;
import org.opencv.features2d.DescriptorExtractor;
import org.opencv.features2d.DescriptorMatcher;
import org.opencv.features2d.FeatureDetector;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * This class is implements from ImageFactory
 */
public class ImageFactoryImpl implements ImageFactory{
    @Override
    public void display(String imagePath) {
        Mat image=imread(imagePath);
        ImageViewer imageViewer = new ImageViewer(image, "ImageWindow");
        imageViewer.imshow();
    }

    @Override
    public void display(Mat mat){
        ImageViewer imageViewer = new ImageViewer(mat, "ImageWindow");
        imageViewer.imshow();
    }

    @Override
    public boolean saveImage(Mat image,String rootPath,String imageName){
        if(image.empty()){
            return false;
        }
        Highgui.imwrite(rootPath+"\\"+imageName,image);
        return true;
    }

    @Override
    public Mat correction(Mat src,Mat dst)
    {
        //===================
        //  geo correction
        //===================
        //find feature points
        FeatureDetector detector =FeatureDetector.create(FeatureDetector.SURF);
        MatOfKeyPoint keypoints_src = new MatOfKeyPoint();
        MatOfKeyPoint keypoints_dst = new MatOfKeyPoint();

        detector.detect(src, keypoints_src);
        detector.detect(dst, keypoints_dst);

        //find descriptors
        Mat descriptors_object=new Mat();
        Mat descriptors_scene=new Mat();

        DescriptorExtractor extractor=DescriptorExtractor.create(DescriptorExtractor.ORB);
        extractor.compute( dst, keypoints_dst, descriptors_object );
        extractor.compute( src, keypoints_src, descriptors_scene );
        DescriptorMatcher matcher = DescriptorMatcher.create(DescriptorMatcher.BRUTEFORCE_HAMMING);

        //match
        MatOfDMatch matches = new MatOfDMatch();
        matcher.match(descriptors_object, descriptors_scene, matches);
        DMatch[] tmmpDMatchs=matches.toArray();

        double max_dist = 0; double min_dist =400;
        for( int i = 0; i < descriptors_object.rows(); i++ )
        {
            double dist =tmmpDMatchs[i].distance;
            if( dist < min_dist ) min_dist = dist;
            if( dist > max_dist ) max_dist = dist;
        }

        //choose good matches
        LinkedList<DMatch> good_matches = new LinkedList<DMatch>();
        for (int i = 0; i < descriptors_object.rows();++i)
        {
            double dist =tmmpDMatchs[i].distance;
            if (dist < 3*min_dist )
            {
                good_matches.add(tmmpDMatchs[i]);
            }
        }

        List<Point> pts_scene = new ArrayList<Point>();
        List<Point> pts_object = new ArrayList<Point>();//
        for(int i = 0; i<good_matches.size(); i++)
        {
            pts_object.add(keypoints_dst.toList().get(good_matches.get(i).queryIdx).pt);
            pts_scene.add(keypoints_src.toList().get(good_matches.get(i).trainIdx).pt);
        }

        Mat outputMask = new Mat();
        MatOfPoint2f pts_sceneMat = new MatOfPoint2f();
        pts_sceneMat.fromList(pts_scene);
        MatOfPoint2f pts_objectMat = new MatOfPoint2f();
        pts_objectMat.fromList(pts_object);

        //calculate homography
        Mat homography = Calib3d.findHomography(pts_objectMat, pts_sceneMat, Calib3d.RANSAC, 10, outputMask);
        Mat resultMat=new Mat(new Size(src.cols(),src.rows()),src.type());

        //change dst
        Imgproc.warpPerspective(dst,resultMat, homography, resultMat.size());
        dst=resultMat;

        //=====================
        //  optics correction
        //=====================

        double[] light_src = new double[pts_scene.size()];
        double[] light_dst = new double[pts_scene.size()];

        for(int i=0;i<pts_scene.size();i++){
            Point psrc=pts_scene.get(i);
            Point pdst=pts_object.get(i);
            double[] d_src=src.get((int)psrc.y,(int)psrc.x);
            double[] d_dst=dst.get((int)pdst.y,(int)pdst.x);
            light_src[i]=d_src[0];
            light_dst[i]=d_dst[0];
        }

        //least-squares procedure
        Map<String, Double> m=new MyLineRegression().lineRegression(light_dst, light_src);
        double a=m.get("a");
        double b=m.get("b");

        Mat resultMat2=new Mat(dst.rows(),dst.cols(),CvType.CV_8UC1);
        for (int i=0;i<dst.rows();i++){
            for(int j=0;j<dst.cols();j++){
                int s= (int) (a*resultMat.get(i,j)[0]+b);
                resultMat2.put(i,j,s);
            }
        }
        return resultMat2;
    }

    @Override
    public Mat findDifference(String srcPath1, String srcPath2) {
        Mat src1=imread(srcPath1,0);
        Mat src2=imread(srcPath2,0);

        //check empty
        if(src1.empty()||src2.empty()){
            System.out.println("Error:Images empty!");
            return null;
        }
        //check size
        if(src1.cols()!=src2.cols()||src1.rows()!=src2.rows()){
            System.out.println("Error:Images-size is not same!");
            return null;
        }

        //================
        //  correction
        //================

        src2=correction(src1,src2);

        //==========
        //  check
        //==========

        //  calculate difference by subtraction
        Mat difImage=new Mat();
        Core.absdiff(src1,src2,difImage);

        //  eroding
        Mat erodeImg=new Mat();
        Mat kernel = Imgproc.getStructuringElement(1,new Size(4,6));
        Imgproc.erode(difImage,erodeImg, kernel,new Point(-1,-1),1);

        //  dilating
        Mat dilateImg = new Mat();
        Mat kernel1 = Imgproc.getStructuringElement(1,new Size(2,3));
        Imgproc.dilate(erodeImg, dilateImg, kernel1);

        //  detection edge
        Mat threshImg = new Mat();
        List<MatOfPoint> contours = new ArrayList<MatOfPoint>();
        Mat hierarchy = new Mat();
        Imgproc.threshold(dilateImg, threshImg, 20, 255, Imgproc.THRESH_BINARY);

        //  find outline
        Imgproc.findContours(threshImg, contours, hierarchy, Imgproc.RETR_TREE, Imgproc.CHAIN_APPROX_SIMPLE, new Point(0,0));

        //=========
        //  paint
        //=========

        //  create rect by outline
        List<Rect> boundRect = new ArrayList<Rect>(contours.size());
        for(int i=0;i<contours.size();i++){
            Rect rect = Imgproc.boundingRect(contours.get(i));
            boundRect.add(rect);
        }

        //  paint rect
        Mat dst=src1;
        for(int i=0;i<contours.size();i++){
            Scalar color = new Scalar(246,255,130);
            rectangle(dst, boundRect.get(i).tl(), boundRect.get(i).br(), color, 2, LINE_8, 0);
            Point p1=boundRect.get(i).tl();
            Point p2=boundRect.get(i).br();
            double size=Math.abs(p1.x-p2.x)*Math.abs(p1.y-p2.y);

            putText(dst, ""+size, boundRect.get(i).tl(), 2,1, color);
        }

        return dst;
    }
}
