package com.khbr.onlineclinic.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.khbr.onlineclinic.domain.dto.CustomerInfo;
import com.khbr.onlineclinic.domain.dto.PatientQueryConditions;
import com.khbr.onlineclinic.domain.dto.QueryPatient;
import com.khbr.onlineclinic.domain.po.AddCustomerInfo;
import com.khbr.onlineclinic.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * Created by Administrator on 2018/8/31 0031.
 */
/*@WebServlet*/
@Controller
@RequestMapping("/customer")
@SessionAttributes("patient")
public class CustomerServlet{
    @Autowired
    private ICustomerService customerService;

    /**
     * 添加病人信息
     * @param addCustomerInfo
     * @return
     */
    @RequestMapping("/add")
    public String addCustomer(AddCustomerInfo addCustomerInfo){

        customerService.addCustomer(addCustomerInfo);

        return "redirect:/customer/query";
    }

    /**
     * 查询病人信息并分页显示
     * @param patientQueryConditions
     * @return
     */
    @RequestMapping("/query")
    public ModelAndView queryCustomer(PatientQueryConditions patientQueryConditions){
        PageHelper.startPage(1,3);
        List<QueryPatient> patients = customerService.queryPatient(patientQueryConditions);
        PageInfo<QueryPatient> queryPatientPageInfo = new PageInfo<>(patients);
        ModelAndView mav1=new ModelAndView("diaCharge");
        mav1.addObject("pageInfo", queryPatientPageInfo);
        mav1.addObject("paQC", patientQueryConditions);
        return mav1;
    }

    /**
     * 根据ID查询病人信息
     * @param id
     * @param jumpTo
     * @return
     */
    @RequestMapping("/queryById")
    public ModelAndView queryCustomerById(Integer id,String jumpTo) {
        CustomerInfo CustomerInfo = customerService.queryPatientById(id);
        ModelAndView mav1=new ModelAndView();
        mav1.addObject("patient", CustomerInfo);
        if (jumpTo.equals("diagnose")) {
            mav1.setViewName("case");
            return mav1;
        }else if (jumpTo.equals("update")){
            mav1.setViewName("updateCustomer");
            return mav1;
        }
        return null;
    }

    /**
     * 修改病人信息
     * @param addCustomerInfo
     * @return
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

    @RequestMapping("/diaCharge")
    public String diaCharge(){
        return "diaCharge";
    }

    @RequestMapping("/drugManage")
    public String drugManage(){
        return "drugManage";
    }

    @RequestMapping("/innerManage")
    public String innerManage(){
        return "innerManage";
    }


    @RequestMapping("/platformManage")
    public String platformManage(){
        return "platformManage";
    }


}


