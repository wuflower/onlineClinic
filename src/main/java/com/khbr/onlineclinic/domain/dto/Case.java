package com.khbr.onlineclinic.domain.dto;

import com.khbr.onlineclinic.domain.enums.CaseTypeEnum;

import java.util.Date;

/**
 * Created by Administrator on 2018/9/4 0004.
 */
public class Case {

    private CaseTypeEnum type;
    private Byte isSubsequent;
    private String selfReported;
    private Date diagnosiDate;
    private String temperature;
    private String systolicPress; //收缩压
    private String diastolicPress;
    private Integer weight;
    private Integer height;

    public Case() {
    }

    public Case(CaseTypeEnum type, Byte isSubsequent, String selfReported, Date diagnosiDate, String temperature, String systolicPress, String diastolicPress, Integer weight, Integer height) {
        this.type = type;
        this.isSubsequent = isSubsequent;
        this.selfReported = selfReported;
        this.diagnosiDate = diagnosiDate;
        this.temperature = temperature;
        this.systolicPress = systolicPress;
        this.diastolicPress = diastolicPress;
        this.weight = weight;
        this.height = height;
    }

    public CaseTypeEnum getType() {
        return type;
    }

    public void setType(CaseTypeEnum type) {
        this.type = type;
    }

    public Byte getIsSubsequent() {
        return isSubsequent;
    }

    public void setIsSubsequent(Byte isSubsequent) {
        this.isSubsequent = isSubsequent;
    }

    public String getSelfReported() {
        return selfReported;
    }

    public void setSelfReported(String selfReported) {
        this.selfReported = selfReported;
    }

    public Date getDiagnosiDate() {
        return diagnosiDate;
    }

    public void setDiagnosiDate(Date diagnosiDate) {
        this.diagnosiDate = diagnosiDate;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getSystolicPress() {
        return systolicPress;
    }

    public void setSystolicPress(String systolicPress) {
        this.systolicPress = systolicPress;
    }

    public String getDiastolicPress() {
        return diastolicPress;
    }

    public void setDiastolicPress(String diastolicPress) {
        this.diastolicPress = diastolicPress;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Case{" +
                "type=" + type +
                ", isSubsequent=" + isSubsequent +
                ", selfReported='" + selfReported + '\'' +
                ", diagnosiDate=" + diagnosiDate +
                ", temperature='" + temperature + '\'' +
                ", systolicPress='" + systolicPress + '\'' +
                ", diastolicPress='" + diastolicPress + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
