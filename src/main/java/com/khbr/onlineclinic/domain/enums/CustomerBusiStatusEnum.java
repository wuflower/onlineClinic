package com.khbr.onlineclinic.domain.enums;

import com.khbr.onlineclinic.util.EnumUtil;

/**
 * 病人相关业务状态枚举
 * 
 * @author dizhu
 *
 */
public enum CustomerBusiStatusEnum implements BaseEnum {
	WAITING_DOCTOR(1, "待诊"),

	FINISH_DIAGNOSE(2, "诊断完毕"),

	FINISH_RECEIPE(3,"已开处方"),

	FINISH_FEE(4,"完成缴费");

	private int status;

	private String message;

	private CustomerBusiStatusEnum(int status, String msg) {
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

	/**
	 * 根据key获取value
	 *
	 * @param status
	 *            : 键值key
	 * @return String
	 */
	public static String getMsgByStatus(Integer status) {
		String message = (String) EnumUtil.getEnumDescriotionByValue(status, CustomerBusiStatusEnum.class);
		return message;
	}
}
