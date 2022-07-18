package com.mis.domain;

public class ScategoryVO {

	private int sNo;
	private String jobName;
	private String jgName;
	private String sName;
	private int sYear;
	private int sQuarter;
	private int sMonth;
	private int sDay;
	private int sUnit;
	private int lNo;
	
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
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
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsYear() {
		return sYear;
	}
	public void setsYear(int sYear) {
		this.sYear = sYear;
	}
	public int getsQuarter() {
		return sQuarter;
	}
	public void setsQuarter(int sQuarter) {
		this.sQuarter = sQuarter;
	}
	public int getsMonth() {
		return sMonth;
	}
	public void setsMonth(int sMonth) {
		this.sMonth = sMonth;
	}
	public int getsDay() {
		return sDay;
	}
	public void setsDay(int sDay) {
		this.sDay = sDay;
	}
	public int getsUnit() {
		return sUnit;
	}
	public void setsUnit(int sUnit) {
		this.sUnit = sUnit;
	}
	public int getlNo() {
		return lNo;
	}
	public void setlNo(int lNo) {
		this.lNo = lNo;
	}
	
	@Override
	public String toString() {
		return "ScategoryVO [sNo=" + sNo + ", jobName=" + jobName + ", jgName=" + jgName + ", sName=" + sName
				+ ", sYear=" + sYear + ", sQuarter=" + sQuarter + ", sMonth=" + sMonth + ", sDay=" + sDay + ", sUnit="
				+ sUnit + ", lNo=" + lNo + "]";
	}
	
	
	
	
}
