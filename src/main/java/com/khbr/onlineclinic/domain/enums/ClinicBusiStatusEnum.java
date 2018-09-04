package com.khbr.onlineclinic.domain.enums;

/**
 * 诊所相关业务状态枚举
 * 
 * @author dizhu
 *
 */
public enum ClinicBusiStatusEnum {
	COMMITED(1, "已提交申请"),

	APPROVED(2, "已通过审批"),

	UNAPPROVED(3,"未通过审批"),

	CLINIC_COMMIT_FAIL(4,"诊所信息提交失败"),

	ADMIN_COMMIT_FAIL(5,"管理员信息提交失败"),

	ADMIN_PERMISSION_COMMIT_FAIL(6,"管理员权限设置失败"),

	CLINIC_ATTACH_COMMIT_FAIL(7,"诊所附件保存失败");

	private int status;

	private String message;

	private ClinicBusiStatusEnum(int status, String msg) {
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
		ClinicBusiStatusEnum[] enums = ClinicBusiStatusEnum.values();
		for (int i = 0; i < enums.length; i++) {
			if (enums[i].getStatus()==status) {
				return enums[i].getMessage();
			}
		}
		return "";
	}
}
