package com.khbr.onlineclinic.domain.enums;

/**
 * 用户角色相关枚举
 * 
 * @author dizhu
 *
 */
public enum UserRoleEnum implements BaseEnum {
	ADMIN_PLATFORM(1, "平台管理员"),

	ADMIN_CLINIC(2, "诊所管理员"),

	DOCTOR(3,"医生"),

	NURSE(4,"护士"),

	OTHER(5,"其他角色");

	private int status;

	private String message;

	private UserRoleEnum(int status, String msg) {
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
