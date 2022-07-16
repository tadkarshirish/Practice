package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="update_request")
public class Requpdate {
	
	
	@Id
	@GeneratedValue
	private int requestno;
	private String rollno;
	private String section;
	private String updatedVal;
	private String reason;
	public int getRequestno() {
		return requestno;
	}
	public void setRequestno(int requestno) {
		this.requestno = requestno;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String string) {
		this.rollno = string;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getUpdatedVal() {
		return updatedVal;
	}
	public void setUpdatedVal(String updatedVal) {
		this.updatedVal = updatedVal;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}


}
