package com.khbr.onlineclinic.dao.impl;

import com.khbr.onlineclinic.dao.CustomerMapper;
import com.khbr.onlineclinic.domain.dto.CustomerInfo;
import com.khbr.onlineclinic.domain.dto.PatientQueryConditions;
import com.khbr.onlineclinic.domain.dto.QueryPatient;
import com.khbr.onlineclinic.domain.po.AddCustomerInfo;
import com.khbr.onlineclinic.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2018/8/31 0031.
 */
public class CustomerDao implements CustomerMapper {

    /**
     * 添加病人信息
     * @param addCustomerInfo
     */
    @Override
    public void insertPatient(AddCustomerInfo addCustomerInfo) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
        mapper.insertPatient(addCustomerInfo);
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     *
     * @param queryConditions
     * @return
     */
    @Override
    public List<QueryPatient> selectCustomer(PatientQueryConditions queryConditions) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
        List<QueryPatient> queryPatients = mapper.selectCustomer(queryConditions);

        return queryPatients;
    }




    /**
     * 查询数据总条数
     * @param queryConditions
     * @return
     */
    @Override
    public Integer selectTotalRows(PatientQueryConditions queryConditions) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
        Integer totalRows = mapper.selectTotalRows(queryConditions);
        sqlSession.close();
        return totalRows;

    }

    /**
     * 根据id查询病人信息
     * @param id
     * @return
     */
    @Override
    public CustomerInfo selectById(Integer id) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
        CustomerInfo addCustomerInfo = mapper.selectById(id);
        sqlSession.close();
        return addCustomerInfo;
    }
}
