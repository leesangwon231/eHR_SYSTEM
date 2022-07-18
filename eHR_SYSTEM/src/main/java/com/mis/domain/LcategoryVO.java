package com.mis.domain;

public class LcategoryVO {

	private int lNo;
	private String lName;
	private int jobNo;
	private String jobName;
	private String jgName;
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
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getJgName() {
		return jgName;
	}
	public void setJgName(String jgName) {
		this.jgName = jgName;
	}
	@Override
	public String toString() {
		return "LcategoryVO [lNo=" + lNo + ", lName=" + lName + ", jobNo=" + jobNo + ", jobName=" + jobName
				+ ", jgName=" + jgName + "]";
	}
	
	
}
