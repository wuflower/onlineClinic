package com.khbr.onlineclinic.domain.enums;

/**
 * 病例业务状态相关枚举
 * 
 * @author dizhu
 *
 */
public enum CaseBusiStatusEnum {
	CURED(1, "治愈"),

	IMPROVED(2, "已见好转"),

	UN_IMPROVED(3,"未见好转");


	private int status;

	private String message;

	private CaseBusiStatusEnum(int status, String msg) {
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
