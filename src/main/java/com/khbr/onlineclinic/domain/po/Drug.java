package com.khbr.onlineclinic.domain.po;

/**
 * Created by Administrator on 2018/9/3 0003.
 */
public class Drug {

    private Integer id;
    private String chemiName;  //药品化学名
    private String commidityName;   //药品商品名
    private String providerName;    //生产商
    private Double unitPrice;    //单价
    private Integer typeId;
    private String typeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChemiName() {
        return chemiName;
    }

    public void setChemiName(String chemiName) {
        this.chemiName = chemiName;
    }

    public String getCommidityName() {
        return commidityName;
    }

    public void setCommidityName(String commidityName) {
        this.commidityName = commidityName;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }


    @Override
    public String toString() {
        return "Drug{" +
                "id=" + id +
                ", chemiName='" + chemiName + '\'' +
                ", commidityName='" + commidityName + '\'' +
                ", providerName='" + providerName + '\'' +
                ", unitPrice=" + unitPrice +
                ", typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
