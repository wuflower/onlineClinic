package com.khbr.onlineclinic.dao;

import com.khbr.onlineclinic.domain.po.Drug;

import java.util.List;

/**
 * Created by Administrator on 2018/9/3 0003.
 */
public interface DrugMapper {

    List<Drug> selectByName(String drugName);
}
