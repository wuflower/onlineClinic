package com.khbr.onlineclinic.service.impl;

import com.khbr.onlineclinic.dao.LoginMapper;
import com.khbr.onlineclinic.dao.impl.LoginDao;
import com.khbr.onlineclinic.domain.po.Admin;
import com.khbr.onlineclinic.service.ILoginService;

/**
 * Created by Administrator on 2018/8/30 0030.
 */
public class LoginService implements ILoginService {
    private LoginMapper loginDao = new LoginDao();

    /**
     *根据用户名查询用户信息判断登录
     * @param accountName
     * @return
     */
    @Override
    public Admin queryByUserName(String accountName) {

        Admin admin = loginDao.selectByAccountName(accountName);

        return admin;
    }

    @Override
    public void register(Admin login) {

    }
}
