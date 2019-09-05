package com.in28minutes.rest.webservices.helloworld;

import java.util.Date;

public class HelloWorldBean {

	private String message;
	private Date data;

	public HelloWorldBean(String message) {
		this.message = message;
		this.data = new Date();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + ", data=" + data + "]";
	}

	

	
}
