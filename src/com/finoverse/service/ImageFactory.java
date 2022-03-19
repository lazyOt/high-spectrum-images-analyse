package com.finoverse.service;
import org.opencv.core.*;

/**
 * ImageFactory implement contain some images process functions.
 */
public interface ImageFactory {
    //=============================
    //  Display images functions
    //=============================
    void display(String imagePath);
    void display(Mat image);

    //==========
    //  save
    //==========
    boolean saveImage(Mat s,String rootPath,String imageName);

    //===================================
    //  Geometric and optics correction
    //===================================
    Mat correction(Mat src,Mat dst);

    //====================================
    //  find Differences from two images
    //====================================
    Mat findDifference(String srcPath1,String srcPath2);
}
