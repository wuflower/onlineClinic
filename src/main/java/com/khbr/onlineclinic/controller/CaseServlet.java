package com.khbr.onlineclinic.controller;

import com.khbr.onlineclinic.domain.po.Case;
import com.khbr.onlineclinic.service.impl.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Administrator on 2018/9/3 0003.
 */
@Controller
@RequestMapping("/case")
public class CaseServlet{

    @Autowired
    CaseService caseService;

    @RequestMapping("/add")
    public String addCase(Case caseBook){

        caseService.addCase(caseBook);
        return "forward:recipe";
    }
}
