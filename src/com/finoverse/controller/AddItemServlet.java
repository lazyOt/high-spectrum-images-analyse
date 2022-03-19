package com.finoverse.controller;

import com.finoverse.domain.Item;
import com.finoverse.service.ItemService;
import com.finoverse.service.impl.ItemServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@WebServlet(name = "AddItemServlet", value = "/AddItemServlet")
public class AddItemServlet extends HttpServlet {


    private ItemService items=new ItemServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String property=request.getParameter("itname");
        String eid=request.getParameter("eid");
        String cid=request.getParameter("cid");
        String wavel=request.getParameter("wavel");
        String imagep=request.getParameter("ip");
        String t=request.getParameter("time");

        int eidi= Integer.parseInt(eid);
        int cidi=Integer.parseInt(cid);
        double wave=Double.parseDouble(wavel);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date date = null;
        try {
            date = sf.parse(t);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        java.sql.Timestamp dateSQL = new java.sql.Timestamp(date.getTime());

        Item it=new Item(dateSQL,eidi,cidi,wave,imagep,property);

        boolean i=items.add(it);

        if(i==true){
            //重定向到首页
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        }
    }
}
