package com.khbr.onlineclinic.domain.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * 性别相关枚举
 * 
 * @author dizhu
 *
 */
public enum SexEnum implements BaseEnum {
	MALE(1, "男性"),

	FEMALE(2, "女性"),

	UNKNOWN(3,"未知");


	private int status;

	private String message;

	static Map<Integer,String> enumMap=new HashMap<Integer, String>();

	static{
		for(ProfessionEnum type:ProfessionEnum.values()){
			enumMap.put(type.getStatus(), type.getMessage());
		}
	}

	private SexEnum(int status, String msg) {
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
