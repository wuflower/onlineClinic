package com.khbr.onlineclinic.service;

import com.khbr.onlineclinic.domain.po.Drug;

import java.util.List;

/**
 * Created by Administrator on 2018/9/3 0003.
 */
public interface IDrugService {

    List<Drug> queryByName(String drugName);
}
