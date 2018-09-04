package com.khbr.onlineclinic.domain.enums;

/**
 * RH血型枚举
 * 
 * @author dizhu
 *
 */
public enum RHTypeEnum {
	POSITIVE(1, "RH阳性"),

	NEGATIVE(2, "RH阴性"),

    UNKOWN(3,"不详");

	private int status;

	private String message;

	private RHTypeEnum(int status, String msg) {
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
