package com.bhavesh16281.springAnnotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ac")
@Scope("prototype")
public class AC {
	private String message;

	public void getMessage() {
		System.out.println("            "+this.message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
