package com.bhavesh16281.springAnnotations;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
	
	public void teacherMethod() {
		System.out.println("9. @Component Annotation: ");
		System.out.println("        @Component is a class-level annotation used to mark a class as a Spring-managed bean. When Spring scans the application, it detects classes annotated with @Component and registers them as beans in the Spring IoC (Inversion of Control) container. These beans can then be injected into other components using dependency injection.");
	}

}
