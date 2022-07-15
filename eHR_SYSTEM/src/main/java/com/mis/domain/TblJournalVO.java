package com.mis.domain;

import java.util.Date;

public class TblJournalVO {

	private int jnNo;
	private Date jnWdate;
	private int jnApno;
	private String jnSatisfaction;
	private String jnApproval;
	private int memNo;
	
	public int getJnNo() {
		return jnNo;
	}
	public void setJnNo(int jnNo) {
		this.jnNo = jnNo;
	}
	public Date getJnWdate() {
		return jnWdate;
	}
	public void setJnWdate(Date jnWdate) {
		this.jnWdate = jnWdate;
	}
	public int getJnApno() {
		return jnApno;
	}
	public void setJnApno(int jnApno) {
		this.jnApno = jnApno;
	}
	public String getJnSatisfaction() {
		return jnSatisfaction;
	}
	public void setJnSatisfaction(String jnSatisfaction) {
		this.jnSatisfaction = jnSatisfaction;
	}
	public String getJnApproval() {
		return jnApproval;
	}
	public void setJnApproval(String jnApproval) {
		this.jnApproval = jnApproval;
	}
	public int getMemNo() {
		return memNo;
	}
	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}
	
	@Override
	public String toString() {
		return "TblJournalVO [jnNo=" + jnNo + ", jnWdate=" + jnWdate + ", jnApno=" + jnApno + ", jnSatisfaction="
				+ jnSatisfaction + ", jnApproval=" + jnApproval + ", memNo=" + memNo + "]";
	}
	
	
}
