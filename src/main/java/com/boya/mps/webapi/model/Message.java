package com.boya.mps.webapi.model;

import java.util.Date;


public class Message {
	private long id;
	private String message;
	private Date createDate;
	private String author;
	
	public Message(){
		
	}
	
	public Message(long id, String message, String author){
		this.id = id;
		this.message = message;
		this.createDate = new Date();
		this.author = author;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
