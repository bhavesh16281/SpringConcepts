package com.bhavesh16281.springAnnotations;

import org.springframework.stereotype.Component;

@Component
public class Dumbell {
	
	public void dumbellMethod() {
		System.out.println("        Using Annotation Configuration: ");
		System.out.println("            In Annotation based configuration, If there is any depenedeny required in a class and if that dependency is annotated with @Autowired then spring will inject the dependecy using DI.");
	}
}
