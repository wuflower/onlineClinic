package com.khbr.onlineclinic.service.impl;

import com.khbr.onlineclinic.dao.CaseMapper;
import com.khbr.onlineclinic.domain.po.Case;
import com.khbr.onlineclinic.service.ICaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/9/4 0004.
 */
@Service
public class CaseService implements ICaseService {

    @Autowired
    CaseMapper caseMapper;

    @Override
    public void addCase(Case caseBook) {
        caseMapper.insertCase(caseBook);
    }
}
