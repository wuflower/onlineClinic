package com.khbr.onlineclinic.dao;

import com.khbr.onlineclinic.domain.po.Admin;



/**
 * Created by Administrator on 2018/8/30 0030.
 */
public interface LoginMapper {

     Admin selectByAccountName(String accountName);
}
