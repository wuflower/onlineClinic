package com.khbr.onlineclinic;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.khbr.onlineclinic.domain.dto.PatientQueryConditions;
import com.khbr.onlineclinic.domain.dto.QueryPatient;
import com.khbr.onlineclinic.domain.po.Drug;
import com.khbr.onlineclinic.service.ICustomerService;
import com.khbr.onlineclinic.service.IDrugService;
import com.khbr.onlineclinic.service.impl.DrugService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2018/9/4 0004.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-AOP.xml")
public class TestDrug {
    @Autowired
    private ICustomerService customerService;

    @Test
    public void testQuery(){
        PageHelper.startPage(0,3);
        PatientQueryConditions patientQueryConditions = new PatientQueryConditions();
        List<QueryPatient> queryPatient = customerService.queryPatient(patientQueryConditions);
        PageInfo page = new PageInfo(queryPatient);
        System.out.println(page);
    }
}
