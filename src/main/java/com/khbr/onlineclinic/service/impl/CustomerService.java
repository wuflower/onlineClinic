package com.khbr.onlineclinic.service.impl;

import com.khbr.onlineclinic.dao.CustomerMapper;
import com.khbr.onlineclinic.domain.po.AddCustomerInfo;
import com.khbr.onlineclinic.domain.dto.CustomerInfo;
import com.khbr.onlineclinic.domain.dto.PatientQueryConditions;
import com.khbr.onlineclinic.domain.dto.QueryPatient;
import com.khbr.onlineclinic.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/8/31 0031.
 */
@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerMapper customerDao;

    /**
     * 新增病人信息
     * @param addCustomerInfo
     */
    @Override
    public void addCustomer(AddCustomerInfo addCustomerInfo) {
        customerDao.insertPatient(addCustomerInfo);
    }

    /**
     * 查询病人信息
     * @param queryConditions
     * @return
     */
    @Override
    public List<QueryPatient> queryPatient(PatientQueryConditions queryConditions) {

        List<QueryPatient> queryPatients = customerDao.selectCustomer(queryConditions);
        return queryPatients;
    }

    /**
     * 根据id查找病人信息
     * @param id
     * @return
     */
    @Override
    public CustomerInfo queryPatientById(Integer id) {
        CustomerInfo addCustomerInfo = customerDao.selectById(id);
        return addCustomerInfo;
    }

    @Override
    public void modifyCustomer(AddCustomerInfo addCustomerInfo) {
        customerDao.updateCustomer(addCustomerInfo);
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerDao.deleteCustomer(id);
    }
}
