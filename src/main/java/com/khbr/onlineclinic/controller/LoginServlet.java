package com.khbr.onlineclinic.controller;

import com.khbr.onlineclinic.domain.po.Admin;
import com.khbr.onlineclinic.service.ILoginService;
import com.khbr.onlineclinic.service.impl.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2018/8/30 0030.
 */
@WebServlet("/admin/*")
@Controller
public class LoginServlet extends HttpServlet {

    @Autowired
    private ILoginService loginService;

    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String url = req.getRequestURI();
        System.out.println(url);
        if (url!=null && "/onlineClinic/admin/login".equals(url)){
            this.login(req,resp);
        }
    }

    public void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");

        Admin login = loginService.queryByUserName(userName);
        if (login!=null){
            if (login.getPassword().equals(password)){
                resp.getWriter().append("ok");
            }else {
                resp.getWriter().append("您输入的密码有误！请重新输入");
            }
        }else {
            resp.getWriter().append("您还未注册，<a href='jsp/register.jsp'>前往注册</a>");
        }
    }

}
