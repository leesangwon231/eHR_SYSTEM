package com.mis.domain;

public class LcategoryVO {

	private int lNo;
	private String lName;
	private int jobNo;
	
	public int getlNo() {
		return lNo;
	}
	public void setlNo(int lNo) {
		this.lNo = lNo;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getJobNo() {
		return jobNo;
	}
	public void setJobNo(int jobNo) {
		this.jobNo = jobNo;
	}
	
	@Override
	public String toString() {
		return "TblLcategoryVO [lNo=" + lNo + ", lName=" + lName + ", jobNo=" + jobNo + "]";
	}
}
