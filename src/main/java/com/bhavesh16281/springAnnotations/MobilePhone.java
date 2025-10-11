package com.bhavesh16281.springAnnotations;

import org.springframework.stereotype.Component;

@Component("mobile")
public class MobilePhone {
	
	private String message;

	public void getMessage() {
		System.out.println("            "+this.message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
