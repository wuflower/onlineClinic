package com.khbr.onlineclinic.service;

import com.khbr.onlineclinic.domain.dto.CustomerInfo;
import com.khbr.onlineclinic.domain.dto.QueryPatient;
import com.khbr.onlineclinic.domain.po.AddCustomerInfo;
import com.khbr.onlineclinic.domain.dto.PatientQueryConditions;

import java.util.List;

/**
 * Created by Administrator on 2018/8/31 0031.
 */
public interface ICustomerService {

    void addCustomer(AddCustomerInfo addCustomerInfo);

    List<QueryPatient> queryPatient(PatientQueryConditions queryConditions);

    CustomerInfo queryPatientById(Integer id);

    void modifyCustomer(AddCustomerInfo addCustomerInfo);

    void deleteCustomer(Integer id);
}
