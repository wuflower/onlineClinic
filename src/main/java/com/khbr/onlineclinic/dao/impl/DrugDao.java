package com.khbr.onlineclinic.dao.impl;

import com.khbr.onlineclinic.dao.DrugMapper;
import com.khbr.onlineclinic.domain.po.Drug;
import com.khbr.onlineclinic.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2018/9/3 0003.
 */
public class DrugDao implements DrugMapper {

    /**
     * 根据药品名查询药品信息
     * @param drugName
     * @return
     */
    @Override
    public List<Drug> selectByName(String drugName) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        DrugMapper mapper = sqlSession.getMapper(DrugMapper.class);
        List<Drug> drugs = mapper.selectByName(drugName);
        return drugs;
    }
}
