package com.khbr.onlineclinic.domain.dto;

import com.khbr.onlineclinic.domain.enums.SexEnum;

import java.lang.String;

/**
 * Created by Administrator on 2018/8/31 0031.
 */
public class QueryPatient {

    /*id,name,age,sex,address,idCardNo,phone*/
    private Integer id;
    private String name;
    private String idCardNo;
    private SexEnum sex;
    private Integer age;
    private String phone;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "QueryPatient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idCardNo='" + idCardNo + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
