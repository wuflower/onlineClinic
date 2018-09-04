package com.khbr.onlineclinic.domain.enums;

/**
 * 药品库存相关枚举
 *
 * @author dizhu
 */
public enum DrugWarehouseBusiStatusEnum {
    UNCHECKED(1, "本轮未盘点"),
    CHECKING(2,"本轮盘点中"),
    CHECKED(3, "本轮盘点完成"),
   // CHECKED_EXCEPTION(3, "本轮盘点发现异常"),
    NO_STOCK_PACKAGE(4, "整盒库存数量为0"),
    NO_STOCK_TOTAL(5, "零药库存数量为零");

    private int status;

    private String message;

    private DrugWarehouseBusiStatusEnum(int status, String msg) {
        this.status = status;
        this.message = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
