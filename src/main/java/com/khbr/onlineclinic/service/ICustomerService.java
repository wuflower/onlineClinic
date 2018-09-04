package com.khbr.onlineclinic.service;

import com.khbr.onlineclinic.domain.dto.CustomerInfo;
import com.khbr.onlineclinic.domain.po.AddCustomerInfo;
import com.khbr.onlineclinic.domain.dto.PageInfo;
import com.khbr.onlineclinic.domain.dto.PatientQueryConditions;

/**
 * Created by Administrator on 2018/8/31 0031.
 */
public interface ICustomerService {

    void addCustomer(AddCustomerInfo addCustomerInfo);

    PageInfo queryPatient(PatientQueryConditions queryConditions);

    CustomerInfo queryPatientById(Integer id);
}
