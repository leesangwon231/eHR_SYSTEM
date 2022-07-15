package com.mis.domain;

public class TblJndetailVO {
	private int jndNo;
	private int jndProgress;
	private String jndNote;
	private String jndHistory;
	private int jnNo;
	private int sNo;
	
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
	public int getJnNo() {
		return jnNo;
	}
	public void setJnNo(int jnNo) {
		this.jnNo = jnNo;
	}
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	
	@Override
	public String toString() {
		return "TblJndetailVO [jndNo=" + jndNo + ", jndProgress=" + jndProgress + ", jndNote=" + jndNote
				+ ", jndHistory=" + jndHistory + ", jnNo=" + jnNo + ", sNo=" + sNo + "]";
	}

	
}
