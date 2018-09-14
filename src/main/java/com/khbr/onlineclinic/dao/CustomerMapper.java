package com.khbr.onlineclinic.dao;

import com.khbr.onlineclinic.domain.dto.CustomerInfo;
import com.khbr.onlineclinic.domain.dto.PatientQueryConditions;
import com.khbr.onlineclinic.domain.dto.QueryPatient;
import com.khbr.onlineclinic.domain.po.AddCustomerInfo;

import java.util.List;

/**
 * Created by Administrator on 2018/8/31 0031.
 */
public interface CustomerMapper {
    void insertPatient(AddCustomerInfo addCustomerInfo);

    List<QueryPatient> selectCustomer(PatientQueryConditions queryConditions);

    Integer selectTotalRows(PatientQueryConditions queryConditions);

    CustomerInfo selectById(Integer id);

    void updateCustomer(AddCustomerInfo addCustomerInfo);

    void deleteCustomer(Integer id);
}
