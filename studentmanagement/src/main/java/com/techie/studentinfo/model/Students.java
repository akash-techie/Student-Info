package com.techie.studentinfo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.deser.Deserializers;

@Entity
@Table(name= "student")
public class Students {

    @Id
    @GeneratedValue
	private int sid;
    @Column(name="f_name")
	private String firstName;	
    @Column(name="l_name")
	private String lastName;
    @Column(name="mob_number")
    private Long mobNumber; 
    @Column(name= "mail_id")
    private String mailId;
	public Integer getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getMobNumber() {
		return mobNumber;
	}
	public void setMobNumber(Long mobNumber) {
		this.mobNumber = mobNumber;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	
}
