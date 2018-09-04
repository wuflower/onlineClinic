package com.khbr.onlineclinic.domain.enums;

/**
 * 系统状态相关枚举
 * 
 * @author dizhu
 *
 */
public enum SystemStatusEnum {
	EDITABLE(1, "可编辑"),//可读可改

	READONLY(2, "只读"),// 可读不能修改

	DISABLED(3, "已禁用"),// 逻辑删除或其他原因使记录不可见
	
	SYSTEM_EXCEPTION(4,"系统异常,异常信息为：");

	private int status;

	private String message;

	private SystemStatusEnum(int status, String msg) {
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
