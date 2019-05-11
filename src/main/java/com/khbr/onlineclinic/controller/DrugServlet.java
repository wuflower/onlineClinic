package com.khbr.onlineclinic.controller;

import com.khbr.onlineclinic.domain.po.Drug;
import com.khbr.onlineclinic.service.IDrugService;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2018/9/3 0003.
 */

@Controller
@RequestMapping("/drug")
public class DrugServlet extends HttpServlet{

    @Autowired
    private IDrugService drugService;


    @RequestMapping("/queryByName")
    @ResponseBody
    public String queryByName(String drugName) throws ServletException, IOException {
        List<Drug> drugs = drugService.queryByName(drugName);
        ObjectMapper mapper = new ObjectMapper();
        String drugString = mapper.writeValueAsString(drugs);
        System.out.println(drugString);
        return drugString;
    }
}
