package com.finoverse.test;

import com.finoverse.dao.ItemDao;
import com.finoverse.dao.impl.ItemDaoImpl;
import com.finoverse.domain.Item;
import com.finoverse.service.ImageFactory;
import com.finoverse.service.impl.ImageFactoryImpl;
import org.opencv.core.Core;
import org.opencv.core.Mat;


//-Djava.library.path=D:\AppForest\program\opencv-2.4.9\opencv\build\java\x64
public class TestImageModelDemo {
    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        ImageFactory imageFactory=new ImageFactoryImpl();
        String src1="D:\\Fino\\Code\\Java\\high-spectrum-data-space\\images\\s1.jpg";
        String src2="D:\\Fino\\Code\\Java\\high-spectrum-data-space\\images\\s2.jpg";
        Mat result=imageFactory.findDifference(src1,src2);

        imageFactory.display(result);
        imageFactory.saveImage(result,"D:\\Fino\\Code\\Java\\high-spectrum-data-space\\images","result.jpg");
    }
}
