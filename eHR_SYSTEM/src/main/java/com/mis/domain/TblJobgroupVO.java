package com.mis.domain;

public class TblJobgroupVO {

	private int jgNo;
	private String jgName;
	
	public int getJgNo() {
		return jgNo;
	}
	public void setJgNo(int jgNo) {
		this.jgNo = jgNo;
	}
	public String getJgName() {
		return jgName;
	}
	public void setJgName(String jgName) {
		this.jgName = jgName;
	}
	
	@Override
	public String toString() {
		return "TblJobgroupVO [jgNo=" + jgNo + ", jgName=" + jgName + "]";
	}
	
}
