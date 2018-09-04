package com.khbr.onlineclinic.service;

import com.khbr.onlineclinic.domain.po.Admin;

/**
 * Created by Administrator on 2018/8/30 0030.
 */
public interface ILoginService {

    Admin queryByUserName(String accountName);

    void register(Admin login);
}
