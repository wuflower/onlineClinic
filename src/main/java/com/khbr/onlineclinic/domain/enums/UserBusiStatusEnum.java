package com.khbr.onlineclinic.domain.enums;

/**
 * 用户状态相关枚举
 * 
 * @author dizhu
 *
 */
public enum UserBusiStatusEnum implements BaseEnum{
	SEX_MALE(1, "男性"),

	SEX_FEMALE(2, "女性"),

	UNAPPROVED(3,"未通过审批");

	private int status;

	private String message;

	private UserBusiStatusEnum(int status, String msg) {
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
