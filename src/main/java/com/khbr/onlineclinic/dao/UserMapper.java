package com.khbr.onlineclinic.dao;

import com.khbr.onlineclinic.domain.dto.User;

import java.util.List;

/**
 * Created by Administrator on 2018/9/6 0006.
 */
public interface UserMapper {

    List<User> selectUser();
}
