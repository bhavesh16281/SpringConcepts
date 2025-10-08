package com.bhavesh16281.springAnnotations;

import org.springframework.stereotype.Service;

@Service ("tv")
public class TV {
	public void tvMethod() {
		System.out.println("7. @Service Annotation: ");
		System.out.println("        The @Service annotation is used to indicate that a class belongs to the service layer in an application. The service layer typically contains the business logic of the application. The @Service annotation is a specialization of the @Component annotation"
				+ " During COmponent scan the spring detects the class with @Service as service class and creates bean for it.");
	}
}
