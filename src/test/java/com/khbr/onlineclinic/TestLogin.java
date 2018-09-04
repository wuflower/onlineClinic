package com.khbr.onlineclinic;


import com.khbr.onlineclinic.dao.LoginMapper;
import com.khbr.onlineclinic.dao.impl.LoginDao;
import com.khbr.onlineclinic.domain.po.Admin;
import org.junit.Test;


/**
 * Created by Administrator on 2018/8/30 0030.
 */
public class TestLogin {
    @Test
    public void testLogin(){
        LoginMapper loginMapper = new LoginDao();

        Admin admin = loginMapper.selectByAccountName("admin");
        System.out.println(admin);
    }
}
