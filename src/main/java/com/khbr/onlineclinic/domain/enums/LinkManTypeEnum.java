package com.khbr.onlineclinic.domain.enums;

/**
 * 联系人类型枚举
 * 
 * @author dizhu
 *
 */
public enum LinkManTypeEnum implements BaseEnum {
	PARENT(1, "父母"),

	CHILDREN(2, "子女"),

	SPOUSE(3,"配偶"),

    OTHER(4,"其他");

	private int status;

	private String message;

	private LinkManTypeEnum(int status, String msg) {
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
