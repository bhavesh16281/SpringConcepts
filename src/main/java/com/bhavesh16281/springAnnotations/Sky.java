package com.bhavesh16281.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Sky {
	
	@Autowired
	private Cloudy cloudy;
	
	public void skyMethod() {
		System.out.println("10. @Autowired Annotation: ");
		System.out.println("        The @Autowired annotation in Spring marks a constructor, setter method, property, or configuration method to be autowired. This means that Spring will automatically inject the required dependencies (beans) at runtime using its Dependency Injection mechanism");

		cloudy.cloudyMethod();
	}
}
