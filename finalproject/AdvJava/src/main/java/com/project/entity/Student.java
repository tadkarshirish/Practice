package com.project.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_detail")
public class Student {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private String password;
	private String mobileNumber;
	private LocalDate AddmissionDate;
	private String Course;
	private String Birthday;
	private String pincode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public LocalDate getAddmissionDate() {
		return AddmissionDate;
	}
	public void setAddmissionDate(LocalDate date) {
		AddmissionDate = date;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public String getBirthday() {
		return Birthday;
	}
	public void setBirthday(String date) {
		Birthday = date;
	}
	public String getPincode() {
		return pincode;
	}
	
	public void setPincode(String string) {
		this.pincode = string;
		
	}

	

}
