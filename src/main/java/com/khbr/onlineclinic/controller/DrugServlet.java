package com.khbr.onlineclinic.controller;

import com.khbr.onlineclinic.domain.po.Drug;
import com.khbr.onlineclinic.service.IDrugService;
import com.khbr.onlineclinic.service.impl.DrugService;
import org.codehaus.jackson.map.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2018/9/3 0003.
 */
@WebServlet("*.drug")
public class DrugServlet extends HttpServlet{

    private IDrugService drugService = new DrugService();

    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String uri = req.getRequestURI();
        if (uri!=null && "/onlineClinic/queryByName.drug".equals(uri)){
            this.queryByName(req,resp);
        }
    }

    public void queryByName(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String drugName = req.getParameter("drugName");
        List<Drug> drugs = drugService.queryByName(drugName);
        ObjectMapper mapper = new ObjectMapper();
        String drugString = mapper.writeValueAsString(drugs);


        System.out.println(drugString);
        resp.getWriter().write(drugString);
    }
}
