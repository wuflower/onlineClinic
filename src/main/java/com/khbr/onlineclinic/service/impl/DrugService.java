package com.khbr.onlineclinic.service.impl;

import com.khbr.onlineclinic.dao.DrugMapper;
import com.khbr.onlineclinic.domain.po.Drug;
import com.khbr.onlineclinic.service.IDrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/9/3 0003.
 */
@Service
public class DrugService implements IDrugService {

    @Autowired
    DrugMapper drugMapper;

    @Override
    public List<Drug> queryByName(String drugName) {
        List<Drug> drugs = drugMapper.selectByName(drugName);
        return drugs;
    }
}
