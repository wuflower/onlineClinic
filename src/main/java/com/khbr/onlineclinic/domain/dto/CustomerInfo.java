package com.khbr.onlineclinic.domain.dto;

import com.khbr.onlineclinic.domain.enums.ProfessionEnum;
import com.khbr.onlineclinic.domain.enums.SexEnum;

import java.sql.Date;

/**
 * Created by Administrator on 2018/8/31 0031.
 */
public class CustomerInfo {

    private Integer id;
    private String name;
    private String idCardNo;
    private SexEnum sex;
    private Date birth;
    private Integer age;
    private Byte isMaried;
    private ProfessionEnum profession;
    private String phone;
    private String province;
    private String city;
    private String district;
    private String street;
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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Byte getIsMaried() {
        return isMaried;
    }

    public void setIsMaried(Byte isMaried) {
        this.isMaried = isMaried;
    }

    public ProfessionEnum getProfession() {
        return profession;
    }

    public void setProfession(ProfessionEnum profession) {
        this.profession = profession;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CustomerInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idCardNo='" + idCardNo + '\'' +
                ", sex=" + sex +
                ", birth=" + birth +
                ", age=" + age +
                ", isMaried=" + isMaried +
                ", profession=" + profession +
                ", phone='" + phone + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
