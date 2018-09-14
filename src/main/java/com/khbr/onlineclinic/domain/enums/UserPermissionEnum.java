package com.khbr.onlineclinic.domain.enums;

/**
 * 用户权限相关枚举
 * 
 * @author dizhu
 *
 */
public enum UserPermissionEnum implements BaseEnum{
	DIAGNOSE(1,"诊断"),
	RECIPE(2,"处方"),
	REGIST_CUSTOMER(3,"登记会员信息"),
	DRUG(4,"药品管理"),
	CHECK_DRUG(5,"药品盘点"),
	CHARGE(6,"收费"),
	RETURN_VISIT(7,"病人回访"),
	MEMBER(8,"会员管理"),
	STATISTICS(9,"查看统计"),
	QUERY_DRUG_ADVITISEMENT(10,"查看药品广告"),
	SUPERADMIN(11,"超级管理员");

	private Integer status;

	private String message;

	UserPermissionEnum(Integer status, String message) {
		this.status = status;
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
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
