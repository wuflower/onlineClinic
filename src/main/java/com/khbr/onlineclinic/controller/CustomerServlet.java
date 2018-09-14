package com.khbr.onlineclinic.controller;

import com.khbr.onlineclinic.domain.dto.CustomerInfo;
import com.khbr.onlineclinic.domain.dto.PageInfo;
import com.khbr.onlineclinic.domain.dto.PatientQueryConditions;
import com.khbr.onlineclinic.domain.po.AddCustomerInfo;
import com.khbr.onlineclinic.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.IOException;


/**
 * Created by Administrator on 2018/8/31 0031.
 */
/*@WebServlet*/
@Controller
@RequestMapping("/customer")
@SessionAttributes("message")
public class CustomerServlet{
    @Autowired
    private ICustomerService customerService;

    /**
     *
     * @param addCustomerInfo
     * @return
     * @throws ServletException
     * @throws IOException
     */
    @RequestMapping("/add")
    public String addCustomer(AddCustomerInfo addCustomerInfo) throws ServletException, IOException {

        customerService.addCustomer(addCustomerInfo);

        return "redirect:/customer/query";
    }

    /**
     *
     * @param patientQueryConditions
     * @return
     */
    @RequestMapping("/query")
    public ModelAndView queryCustomer(PatientQueryConditions patientQueryConditions){

        PageInfo pageInfo = customerService.queryPatient(patientQueryConditions);
        ModelAndView mav1=new ModelAndView("diaCharge");
        mav1.addObject("pageInfo", pageInfo);
        mav1.addObject("paQC", patientQueryConditions);
        return mav1;
    }

    /**
     *
     * @param id
     * @param jumpTo
     * @throws ServletException
     * @throws IOException
     */
    @RequestMapping("/queryById")
    public ModelAndView queryCustomerById(Integer id,String jumpTo) {
        CustomerInfo addCustomerInfo = customerService.queryPatientById(id);
        if (jumpTo.equals("diagnose")) {
            return new ModelAndView("case","patient", addCustomerInfo);
        }else if (jumpTo.equals("update")){
            return new ModelAndView("updateCustomer","patient", addCustomerInfo);
        }
        return null;
    }

    /**
     *
     * @param addCustomerInfo
     * @return
     * @throws ServletException
     * @throws IOException
     */
    @RequestMapping("/modify")
    public String modifyCustomer(AddCustomerInfo addCustomerInfo){
       customerService.modifyCustomer(addCustomerInfo);
        return "redirect:/customer/query";
    }

    /**
     * 删除用户，即改变数据库中的状态
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    public String deleteCustomer(Integer id){
        customerService.deleteCustomer(id);
        return "redirect:/customer/query";
    }
}


