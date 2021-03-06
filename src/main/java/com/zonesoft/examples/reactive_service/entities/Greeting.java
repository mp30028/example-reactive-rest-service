package com.zonesoft.examples.reactive_service.entities;


public class Greeting {

	private String message;

	public Greeting() {
	}

	public Greeting(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Greeting{" +
				"message='" + message + '\'' +
				'}';
	}
}
