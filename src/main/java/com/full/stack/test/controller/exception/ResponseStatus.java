package com.full.stack.test.controller.exception;

import java.util.Date;

public class ResponseStatus {
private Date timestamp;
private String message;
private String desc;


public ResponseStatus() {
	super();
	// TODO Auto-generated constructor stub
}
public ResponseStatus(Date timestamp, String message, String desc) {
	super();
	this.timestamp = timestamp;
	this.message = message;
	this.desc = desc;
}
public Date getTimestamp() {
	return timestamp;
}
public void setTimestamp(Date timestamp) {
	this.timestamp = timestamp;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
@Override
public String toString() {
	return "ResponseStatus [timestamp=" + timestamp + ", message=" + message + ", desc=" + desc + "]";
}

}
