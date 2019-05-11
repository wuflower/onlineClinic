package com.khbr.onlineclinic.domain.dto;

import java.util.List;

/**
 * Created by Administrator on 2018/9/14 0014.
 */
public class Recipe {
    private Integer id;
    private String customerId;
    private Integer recipeType;
    private Double recipeDrugTotalFee;
    private double doctorFee;
    private Double recipeTotalFee;
    private List<RecipeDrug> recipeDrug;

    public Recipe() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Integer getRecipeType() {
        return recipeType;
    }

    public void setRecipeType(Integer recipeType) {
        this.recipeType = recipeType;
    }

    public Double getRecipeDrugTotalFee() {
        return recipeDrugTotalFee;
    }

    public void setRecipeDrugTotalFee(Double recipeDrugTotalFee) {
        this.recipeDrugTotalFee = recipeDrugTotalFee;
    }

    public double getDoctorFee() {
        return doctorFee;
    }

    public void setDoctorFee(double doctorFee) {
        this.doctorFee = doctorFee;
    }

    public Double getRecipeTotalFee() {
        return recipeTotalFee;
    }

    public void setRecipeTotalFee(Double recipeTotalFee) {
        this.recipeTotalFee = recipeTotalFee;
    }

    public List<RecipeDrug> getRecipeDrug() {
        return recipeDrug;
    }

    public void setRecipeDrug(List<RecipeDrug> recipeDrug) {
        this.recipeDrug = recipeDrug;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", customerId='" + customerId + '\'' +
                ", recipeType=" + recipeType +
                ", recipeDrugTotalFee=" + recipeDrugTotalFee +
                ", doctorFee=" + doctorFee +
                ", recipeTotalFee=" + recipeTotalFee +
                ", recipeDrug=" + recipeDrug +
                '}';
    }
}
