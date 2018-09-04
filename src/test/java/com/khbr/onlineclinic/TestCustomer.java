package com.khbr.onlineclinic;

import com.khbr.onlineclinic.dao.CustomerMapper;
import com.khbr.onlineclinic.dao.impl.CustomerDao;
import com.khbr.onlineclinic.domain.dto.PageInfo;
import com.khbr.onlineclinic.domain.dto.PatientQueryConditions;
import com.khbr.onlineclinic.domain.dto.QueryPatient;
import com.khbr.onlineclinic.service.ICustomerService;
import com.khbr.onlineclinic.service.impl.CustomerService;
import org.junit.Test;

import java.util.Date;
import java.util.List;

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
        PatientQueryConditions patientQueryConditions = new PatientQueryConditions();
        CustomerMapper customerMapper = new CustomerDao();
        List<QueryPatient> queryPatients = customerMapper.selectCustomer(patientQueryConditions);
        System.out.println(queryPatients);
    }
}
