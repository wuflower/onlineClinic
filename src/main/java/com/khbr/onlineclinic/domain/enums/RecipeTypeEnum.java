package com.khbr.onlineclinic.domain.enums;

/**
 * 处方类型相关枚举
 * 
 * @author dizhu
 *
 */
public enum RecipeTypeEnum {
	WEST_MED_RECIPE(1, "西医处方"),

	CHI_MED_CASE(2, "中医处方"),

	OTHER_CASE(3,"其他类型处方");


	private int status;

	private String message;

	private RecipeTypeEnum(int status, String msg) {
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
