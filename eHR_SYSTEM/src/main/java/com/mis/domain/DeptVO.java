package com.mis.domain;

public class DeptVO {

	private int deptNo;
	private String deptName;
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "TblDeptVO [deptNo=" + deptNo + ", deptName=" + deptName + "]";
	}
	
	
}
