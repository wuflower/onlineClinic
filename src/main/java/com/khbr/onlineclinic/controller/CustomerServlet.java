package com.khbr.onlineclinic.controller;

import com.khbr.onlineclinic.domain.dto.CustomerInfo;
import com.khbr.onlineclinic.domain.enums.SexEnum;
import com.khbr.onlineclinic.domain.po.AddCustomerInfo;
import com.khbr.onlineclinic.domain.dto.PageInfo;
import com.khbr.onlineclinic.domain.dto.PatientQueryConditions;
import com.khbr.onlineclinic.service.ICustomerService;
import com.khbr.onlineclinic.service.impl.CustomerService;
import org.apache.commons.lang3.EnumUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Date;

/**
 * Created by Administrator on 2018/8/31 0031.
 */
@WebServlet("*.customer")
public class CustomerServlet extends HttpServlet {
    private ICustomerService customerService = new CustomerService();

    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String uri = req.getRequestURI();
        System.out.println(uri);

        if (uri != null && "/onlineClinic/add.customer".equals(uri)) {
            this.addCustomer(req, resp);
        } else if (uri != null && "/onlineClinic/query.customer".equals(uri)) {
            this.queryCustomer(req, resp);
        } else if (uri != null && "/onlineClinic/queryById.customer".equals(uri)) {
            this.queryCustomerById(req, resp);
        }

    }

    /**
     * 增加病人信息
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    public void addCustomer(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String idCardNo = req.getParameter("idCardNo");
        String sex = req.getParameter("sex");
        String birth = req.getParameter("birth");
        String age = req.getParameter("age");
        String isMaried = req.getParameter("isMaried");
        String profession = req.getParameter("profession");
        String phone = req.getParameter("phone");
        String province = req.getParameter("province");
        String city = req.getParameter("city");
        String district = req.getParameter("district");
        String street = req.getParameter("street");
        String address = req.getParameter("address");


        AddCustomerInfo addCustomerInfo = new AddCustomerInfo(name, idCardNo, Integer.valueOf(sex), Date.valueOf(birth), Integer.valueOf(age), Byte.valueOf(isMaried), Integer.valueOf(profession), phone, province, city, district, street, address);

        customerService.addCustomer(addCustomerInfo);

        resp.sendRedirect("query.customer");
    }

    /**
     * 查询病人信息
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    public void queryCustomer(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String patientKeyInfo = req.getParameter("patientKeyInfo");
        String currentPage = req.getParameter("currentPage");

        PatientQueryConditions patientQueryConditions = new PatientQueryConditions();
        if (patientKeyInfo != null && !"".equals(patientKeyInfo)) {
            patientQueryConditions.setQueryCon(patientKeyInfo);
        }
        if (currentPage != null && !"".equals(currentPage)) {
            patientQueryConditions.setCurrentPage(Integer.valueOf(currentPage));
        }
        PageInfo pageInfo = customerService.queryPatient(patientQueryConditions);
        req.setAttribute("pageInfo", pageInfo);
        req.setAttribute("paQC", patientQueryConditions);

        req.getRequestDispatcher("diaCharge.jsp").forward(req, resp);
    }

    /**
     * 根据id查询病人信息
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    public void queryCustomerById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String jumpTo = req.getParameter("jumpTo");
        CustomerInfo addCustomerInfo = customerService.queryPatientById(Integer.valueOf(id));
        HttpSession session = req.getSession();
        session.setAttribute("patient", addCustomerInfo);
        if (jumpTo.equals("diagnose")) {
            req.getRequestDispatcher("caseAndRecipe.jsp").forward(req, resp);
        }else if (jumpTo.equals("update")){
            req.getRequestDispatcher("updateCustomer.jsp").forward(req,resp);
        }
    }

    /**
     * 修改病人信息
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    public void modifyCustomer(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("customerId");
        String name = req.getParameter("name");
        String sex = req.getParameter("sex");
        String idCardNo = req.getParameter("idCardNo");
        String birth = req.getParameter("birth");
        String age = req.getParameter("age");
        String isMaried = req.getParameter("isMaried");
        String province = req.getParameter("province");
        String city = req.getParameter("city");
        String phone = req.getParameter("phone");
        String district = req.getParameter("district");
        String street = req.getParameter("street");
        String address = req.getParameter("address");


        AddCustomerInfo addCustomerInfo = new AddCustomerInfo();
        addCustomerInfo.setId(Integer.valueOf(id));
        addCustomerInfo.setName(name);
        SexEnum sexEnum = EnumUtils.getEnum(SexEnum.class, sex);
        addCustomerInfo.setSex(sexEnum.getStatus());
        addCustomerInfo.setIdCardNo(idCardNo);
        addCustomerInfo.setBirth(Date.valueOf(birth));
        addCustomerInfo.setAge(Integer.valueOf(age));
        addCustomerInfo.setIsMaried(Byte.valueOf(isMaried));
        addCustomerInfo.setProvince(province);
        addCustomerInfo.setCity(city);
        addCustomerInfo.setDistrict(district);
        addCustomerInfo.setStreet(street);
        addCustomerInfo.setAddress(address);
        addCustomerInfo.setPhone(phone);


        customerService.modifyCustomer(addCustomerInfo);

        resp.sendRedirect("query.customer");
    }
}


