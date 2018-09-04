package com.khbr.onlineclinic.domain.enums;

/**
 * 病例类型相关枚举
 * 
 * @author dizhu
 *
 */
public enum CaseTypeEnum {
	WEST_MED_CASE(1, "西医病例"),

	CHI_MED_CASE(2, "中医病例"),

	OTHER_CASE(3,"其他类型病例");


	private int status;

	private String message;

	private CaseTypeEnum(int status, String msg) {
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
