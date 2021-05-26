package com.full.stack.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passport {
@Id
@GeneratedValue
private Integer pid;
private String passport_number;


public Passport() {
	super();
	// TODO Auto-generated constructor stub
}
public Passport(String passport_number) {
	super();
	this.passport_number = passport_number;
}
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public String getPassport_number() {
	return passport_number;
}
public void setPassport_number(String passport_number) {
	this.passport_number = passport_number;
}
@Override
public String toString() {
	return "Passport [pid=" + pid + ", passport_number=" + passport_number + "]";
}

}
