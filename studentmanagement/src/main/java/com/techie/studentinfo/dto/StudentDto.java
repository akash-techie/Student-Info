package com.techie.studentinfo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentDto {
	
	@JsonProperty("First Name")
	private String firstName;
	@JsonProperty("Last Name")
	private String LastName;
	@JsonProperty("Mobile Number")
	private int mobNumber;
	@JsonProperty("Email Id")
	private String mailId;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getMobNumber() {
		return mobNumber;
	}
	public void setMobNumber(int mobNumber) {
		this.mobNumber = mobNumber;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
}
