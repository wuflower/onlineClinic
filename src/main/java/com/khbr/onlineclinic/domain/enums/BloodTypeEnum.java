package com.khbr.onlineclinic.domain.enums;

/**
 * 血型相关枚举(特指ABO血型系统)
 * 
 * @author dizhu
 *
 */
public enum BloodTypeEnum implements BaseEnum {
	A(1, "A型血"),

	B(2, "B型血"),

	AB(3,"AB型血"),

	O(4,"O型血"),

	UNKNOWN(5,"不详");


	private int status;

	private String message;

	private BloodTypeEnum(int status, String msg) {
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
