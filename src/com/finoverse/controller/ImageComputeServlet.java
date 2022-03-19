package com.finoverse.controller;

import com.finoverse.service.ImageFactory;
import com.finoverse.service.impl.ImageFactoryImpl;
import org.opencv.core.Core;
import org.opencv.core.Mat;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ImageComputeServlet", value = "/ImageComputeServlet")
public class ImageComputeServlet extends HttpServlet {
    private ImageFactory imf=new ImageFactoryImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        String imagePath_1=request.getParameter("imagePath1");
        String imagePath_2=request.getParameter("imagePath2");
        System.out.println(imagePath_1);
        System.out.println(imagePath_2);

        imf.display(imagePath_1);
        imf.display(imagePath_2);

        Mat mat=imf.findDifference(imagePath_1,imagePath_2);
        imf.display(mat);

        response.sendRedirect(request.getContextPath()+"/index.jsp");
    }
}
