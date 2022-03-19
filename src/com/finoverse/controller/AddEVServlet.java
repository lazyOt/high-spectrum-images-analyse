package com.finoverse.controller;

import com.finoverse.domain.Environment;
import com.finoverse.service.EVService;
import com.finoverse.service.impl.EVServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddEVServlet", value = "/AddEVServlet")
public class AddEVServlet extends HttpServlet {

    private EVService evs=new EVServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String property=request.getParameter("evname");
        String tp=request.getParameter("tp");
        String rh=request.getParameter("rh");
        float tpf=Float.valueOf(tp);
        float rhf=Float.valueOf(rh);
        Environment ev=new Environment(tpf,rhf,property);

        boolean i=evs.add(ev);

        if(i){
            //重定向到首页
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        }
    }
}
