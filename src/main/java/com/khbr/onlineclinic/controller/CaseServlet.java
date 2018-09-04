package com.khbr.onlineclinic.controller;

import com.khbr.onlineclinic.domain.po.Case;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

/**
 * Created by Administrator on 2018/9/3 0003.
 */
@WebServlet("*.case")
public class CaseServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String uri = req.getRequestURI();
        if (uri!=null && "/onlineClinic/add.case".equals(uri)){
            this.addCase(req,resp);
        }



    }

    public void addCase(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type = req.getParameter("type");
        String isSubsequent = req.getParameter("isSubsequent");
        String selfReported = req.getParameter("selfReported");
        String temperature = req.getParameter("temperature");
        String systolicPress = req.getParameter("systolicPress");
        String diastolicPress = req.getParameter("diastolicPress");
        String weight = req.getParameter("weight");
        String height = req.getParameter("height");
        String diagnosiDate = req.getParameter("diagnosiDate");

        Case caseBook = new Case(Integer.valueOf(type),Byte.valueOf(isSubsequent),selfReported, Date.valueOf(diagnosiDate),temperature,systolicPress,diastolicPress,Integer.valueOf(weight),Integer.valueOf(height));

    }
}
