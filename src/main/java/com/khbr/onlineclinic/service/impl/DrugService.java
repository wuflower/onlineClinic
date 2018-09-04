package com.khbr.onlineclinic.service.impl;

import com.khbr.onlineclinic.dao.DrugMapper;
import com.khbr.onlineclinic.dao.impl.DrugDao;
import com.khbr.onlineclinic.domain.po.Drug;
import com.khbr.onlineclinic.service.IDrugService;

import java.util.List;

/**
 * Created by Administrator on 2018/9/3 0003.
 */
public class DrugService implements IDrugService {
    DrugMapper drugMapper = new DrugDao();

    @Override
    public List<Drug> queryByName(String drugName) {
        List<Drug> drugs = drugMapper.selectByName(drugName);
        return drugs;
    }
}
