package com.khbr.onlineclinic.domain.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * 职业相关枚举
 * 
 * @author dizhu
 *
 */
public enum ProfessionEnum implements BaseEnum  {
	FARMER(1, "农牧渔民"),

	WORKER(2, "工人"),

	STAFF(3,"职员"),

    OTHER(4,"其他");

	private int status;

	private String message;
	static Map<Integer,String> enumMap=new HashMap<Integer, String>();

	static{
		for(ProfessionEnum type:ProfessionEnum.values()){
			enumMap.put(type.getStatus(), type.getMessage());
		}
	}

	private ProfessionEnum(int status, String msg) {
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
