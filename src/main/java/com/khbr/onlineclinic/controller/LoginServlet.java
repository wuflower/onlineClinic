package com.khbr.onlineclinic.controller;

import com.khbr.onlineclinic.domain.po.Admin;
import com.khbr.onlineclinic.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialStruct;
import java.io.IOException;

/**
 * Created by Administrator on 2018/8/30 0030.
 */
/*@WebServlet("/admin*//*")*/

@Controller
@RequestMapping("/admin")
public class LoginServlet extends HttpServlet {

    @Autowired
    ILoginService loginService;


    @RequestMapping("/login")
    @ResponseBody
    public String login(String userName,String password){
        Admin login = loginService.queryByUserName(userName);
        if (login!=null){
            if (login.getPassword().equals(password)){
                return "ok";
            }else {
                return "您输入的密码有误！请重新输入";
            }
        }else {
            return "您还未注册，<a href='jsp/register.jsp'>前往注册</a>";
        }
    }

}
