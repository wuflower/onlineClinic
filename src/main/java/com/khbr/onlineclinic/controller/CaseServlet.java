package com.khbr.onlineclinic.controller;

import com.khbr.onlineclinic.domain.po.Case;
import com.khbr.onlineclinic.service.impl.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by Administrator on 2018/9/3 0003.
 */
@Controller
@RequestMapping("/case")
@SessionAttributes("patientCase")
public class CaseServlet{

    @Autowired
    CaseService caseService;

    @RequestMapping("/add")
    public ModelAndView addCase(Case caseBook){
        ModelAndView mav = new ModelAndView("recipe");
        mav.addObject("patientCase",caseBook);
        caseService.addCase(caseBook);
        return mav;
    }
}
