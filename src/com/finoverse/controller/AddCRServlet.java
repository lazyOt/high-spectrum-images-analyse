package com.finoverse.controller;

import com.finoverse.domain.CulturalRelics;
import com.finoverse.service.CRService;
import com.finoverse.service.impl.CRServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddCRServlet", value = "/AddCRServlet")
public class AddCRServlet extends HttpServlet {

    private CRService CRS=new CRServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1 获取参数
        String property=request.getParameter("crname");

        //2 封装
        CulturalRelics cr=new CulturalRelics(property);

        //3 调用业务逻辑层 响应
        boolean i=CRS.add(cr);

        //4 根据结果响应前端
        if(i){
            //重定向到首页
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        }

    }
}
