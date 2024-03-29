package com.mis.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class JndetailVO {


	private int jnNo;
	private int jndNo;
	private int jndProgress;
	private String jndNote;
	private String jndHistory;
	private int sNo;
	private ArrayList<JndetailVO> jnLIst;
	
	public int getJnNo() {
		return jnNo;
	}
	public void setJnNo(int jnNo) {
		this.jnNo = jnNo;
	}
	public int getJndNo() {
		return jndNo;
	}
	public void setJndNo(int jndNo) {
		this.jndNo = jndNo;
	}
	public int getJndProgress() {
		return jndProgress;
	}
	public void setJndProgress(int jndProgress) {
		this.jndProgress = jndProgress;
	}
	public String getJndNote() {
		return jndNote;
	}
	public void setJndNote(String jndNote) {
		this.jndNote = jndNote;
	}
	public String getJndHistory() {
		return jndHistory;
	}
	public void setJndHistory(String jndHistory) {
		this.jndHistory = jndHistory;
	}
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public ArrayList<JndetailVO> getJnLIst() {
		return jnLIst;
	}
	public void setJnLIst(ArrayList<JndetailVO> jnLIst) {
		this.jnLIst = jnLIst;
	}
	@Override
	public String toString() {
		return "JndetailVO [jnNo=" + jnNo + ", jndNo=" + jndNo + ", jndProgress=" + jndProgress + ", jndNote=" + jndNote
				+ ", jndHistory=" + jndHistory + ", sNo=" + sNo + ", jnLIst=" + jnLIst + "]";
	}
	
		
}
