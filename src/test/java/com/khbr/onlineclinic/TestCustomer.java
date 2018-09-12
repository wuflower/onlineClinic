package com.khbr.onlineclinic;

import com.khbr.onlineclinic.domain.dto.PageInfo;
import com.khbr.onlineclinic.domain.dto.PatientQueryConditions;
import com.khbr.onlineclinic.service.ICustomerService;
import com.khbr.onlineclinic.service.impl.CustomerService;
import org.junit.Test;

import java.util.Date;

/**
 * Created by Administrator on 2018/8/31 0031.
 */
public class TestCustomer {
    private ICustomerService customerService = new CustomerService();


    @Test
    public void testInsert(){
        /*name,idCardNo,sex,birth,age,phone,isMaried,profession,province,city,district,street,address*/
        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        Byte b=1;

    }

    @Test
    public void testQuery(){
        PatientQueryConditions patientQueryConditions = new PatientQueryConditions();
        PageInfo pageInfo = customerService.queryPatient(patientQueryConditions);
        System.out.println(pageInfo);
    }


    @Test
    public void testquerydao(){

    }
}
