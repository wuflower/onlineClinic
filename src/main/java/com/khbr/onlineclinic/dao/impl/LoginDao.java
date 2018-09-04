package com.khbr.onlineclinic.dao.impl;

import com.khbr.onlineclinic.dao.LoginMapper;
import com.khbr.onlineclinic.domain.po.Admin;
import com.khbr.onlineclinic.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by Administrator on 2018/8/30 0030.
 */
public class LoginDao implements LoginMapper{

    /**
     * 根据用户名查询用户信息判断登录
     * @param accountName
     *
     * @return
     */
    @Override
    public Admin selectByAccountName(String accountName) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        LoginMapper mapper = sqlSession.getMapper(LoginMapper.class);
        Admin admin = mapper.selectByAccountName(accountName);
        sqlSession.close();
        return admin;
    }
}
