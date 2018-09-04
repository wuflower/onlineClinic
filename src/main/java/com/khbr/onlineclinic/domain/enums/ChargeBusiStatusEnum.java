package com.khbr.onlineclinic.domain.enums;

/**
 * 收费相关业务状态枚举
 * 
 * @author dizhu
 *
 */
public enum ChargeBusiStatusEnum {
	UN_PAID(1, "未缴费"),

	PAID(2, "已缴费");


	private int status;

	private String message;

	private ChargeBusiStatusEnum(int status, String msg) {
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
		ChargeBusiStatusEnum[] enums = ChargeBusiStatusEnum.values();
		for (int i = 0; i < enums.length; i++) {
			if (enums[i].getStatus()==status) {
				return enums[i].getMessage();
			}
		}
		return "";
	}
}
