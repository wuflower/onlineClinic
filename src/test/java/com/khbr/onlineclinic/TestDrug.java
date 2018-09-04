package com.khbr.onlineclinic;

import com.khbr.onlineclinic.domain.po.Drug;
import com.khbr.onlineclinic.service.IDrugService;
import com.khbr.onlineclinic.service.impl.DrugService;
import org.junit.Test;

import java.util.List;

/**
 * Created by Administrator on 2018/9/4 0004.
 */
public class TestDrug {
    private IDrugService drugService = new DrugService();

    @Test
    public void testQuery(){
        String drugName="d";
        List<Drug> drugs = drugService.queryByName(drugName);
        System.out.println(drugs);
    }
}
