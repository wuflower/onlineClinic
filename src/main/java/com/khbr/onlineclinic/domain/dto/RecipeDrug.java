package com.khbr.onlineclinic.domain.dto;

/**
 * Created by Administrator on 2018/9/14 0014.
 */
public class RecipeDrug {

    private String drugId;
    private String recipeId;
    private Integer times;  //总的服用次数
    private Integer account; //服用数量，一次几颗、几片。。。
    private Integer frequency;  //服用频率，每天服用几次
    private Integer days;   //服用天数
    private Integer totalAmount; //服用总数量
    private Double drugUnitFee;  //单个药品价格
    private Double recipeDrugFee;  //处方中该项药品总价格  drugUnitFee*totalAccount

    RecipeDrug(){}

    public String getDrugId() {
        return drugId;
    }

    public void setDrugId(String drugId) {
        this.drugId = drugId;
    }

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getDrugUnitFee() {
        return drugUnitFee;
    }

    public void setDrugUnitFee(Double drugUnitFee) {
        this.drugUnitFee = drugUnitFee;
    }

    public Double getRecipeDrugFee() {
        return recipeDrugFee;
    }

    public void setRecipeDrugFee(Double recipeDrugFee) {
        this.recipeDrugFee = recipeDrugFee;
    }

    @Override
    public String toString() {
        return "RecipeDrug{" +
                "drugId='" + drugId + '\'' +
                ", recipeId='" + recipeId + '\'' +
                ", times=" + times +
                ", account=" + account +
                ", frequency=" + frequency +
                ", days=" + days +
                ", totalAmount=" + totalAmount +
                ", drugUnitFee=" + drugUnitFee +
                ", recipeDrugFee=" + recipeDrugFee +
                '}';
    }
}
