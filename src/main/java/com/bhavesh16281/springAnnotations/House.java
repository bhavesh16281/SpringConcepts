package com.bhavesh16281.springAnnotations;

public class House {
	
	public void houseMethod() {
		System.out.println("3. @Bean Annotation: ");
		System.out.println("        The @Bean Annotation in Spring is used to define a method that produces a bean to be managed by the Spring IOC (Inversion of Control) container."
				+ " unlike @Component, which relies on class-level scanning, @Bean explicitly declares beans inside @Configuration classes, offering greater flexibility in object creation.");
	}
}
