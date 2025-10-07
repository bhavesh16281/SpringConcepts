package com.bhavesh16281.springAnnotations;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class Pen {

	public void penMethod() {
		// TODO Auto-generated method stub
		System.out.println("2. @ComponentScan: ");
		System.out.println("        This annotation is used to specify the package that the spring has to scan to create beans "
				+ "the @ComponentScan will scan all the classes mentioned in the package and checks for the classes annotated with"
				+ " @Component, @Service, @Repository and @Controller so that spring registers them as beans.");
	}

}
