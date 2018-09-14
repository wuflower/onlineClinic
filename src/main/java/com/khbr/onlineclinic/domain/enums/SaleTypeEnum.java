package com.khbr.onlineclinic.domain.enums;

/**
 * 销售类型相关枚举
 * 
 * @author dizhu
 *
 */
public enum SaleTypeEnum implements BaseEnum{
	HE(1, "非拆零销售"),

	PIAN(2, "拆零销售");


	private int status;

	private String message;

	private SaleTypeEnum(int status, String msg) {
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
