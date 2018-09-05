package com.khbr.onlineclinic.service.impl;

import com.khbr.onlineclinic.dao.CustomerMapper;
import com.khbr.onlineclinic.dao.impl.CustomerDao;
import com.khbr.onlineclinic.domain.po.AddCustomerInfo;
import com.khbr.onlineclinic.domain.dto.CustomerInfo;
import com.khbr.onlineclinic.domain.dto.PageInfo;
import com.khbr.onlineclinic.domain.dto.PatientQueryConditions;
import com.khbr.onlineclinic.domain.dto.QueryPatient;
import com.khbr.onlineclinic.service.ICustomerService;

import java.util.List;

/**
 * Created by Administrator on 2018/8/31 0031.
 */
public class CustomerService implements ICustomerService {
    private CustomerMapper customerDao = new CustomerDao();

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
    public PageInfo queryPatient(PatientQueryConditions queryConditions) {

        PageInfo<QueryPatient> pageInfo = new PageInfo();

        Integer id=2;

        List<QueryPatient> patients = customerDao.selectCustomer(queryConditions);
        pageInfo.setData(patients);

        Integer count = queryConditions.getPageSize(); //每页显示数据条数
        pageInfo.setPageSize(count);

        pageInfo.setCurrentPage(queryConditions.getCurrentPage());  //当前第几页

        Integer totalRows = customerDao.selectTotalRows(queryConditions);
        pageInfo.setTotalRows(totalRows);

        Integer totalPage=(totalRows+count-1)/count;
        pageInfo.setTotalPage(totalPage);


        return pageInfo;
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
}
