package com.khbr.onlineclinic;


import com.khbr.onlineclinic.controller.LoginServlet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by Administrator on 2018/8/30 0030.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-AOP.xml")
public class TestLogin {
    @Autowired
    private LoginServlet loginServlet;

    @Test
    public void testLogin(){

    }
}
