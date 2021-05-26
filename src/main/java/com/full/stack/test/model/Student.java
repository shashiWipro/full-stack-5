package com.full.stack.test.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
private Integer sid;
private String sname;

@OneToOne(fetch=FetchType.LAZY)
private Passport passport;


public Passport getPassport() {
	return passport;
}
public void setPassport(Passport passport) {
	this.passport = passport;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(Integer sid, String sname) {
	super();
	this.sid = sid;
	this.sname = sname;
}
public Integer getSid() {
	return sid;
}
public void setSid(Integer sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + "]";
}

}
