package com.khbr.onlineclinic.dao.impl;

import com.khbr.onlineclinic.dao.UserMapper;
import com.khbr.onlineclinic.domain.dto.User;
import com.khbr.onlineclinic.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2018/9/7 0007.
 */
public class UserDao implements UserMapper {
    @Override
    public List<User> selectUser() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();
        return users;
    }
}
