package com.yogesh.microservices.twitter.consumer;

public class TwitterMessage {
	
	
	private int id;	
	
	private String message;
	
	public TwitterMessage() {
		// TODO Auto-generated constructor stub
	}
	
	public TwitterMessage(int id, String message) {
		super();
		this.id = id;
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "TwitterMessage [id=" + id + ", message=" + message + "]";
	}

}
