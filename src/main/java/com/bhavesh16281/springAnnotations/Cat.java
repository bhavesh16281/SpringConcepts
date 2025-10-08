package com.bhavesh16281.springAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat {
	
	@Value("${cat.name}")
	private String name;
	
	
	@Value("${cat.age}")
	private int age;
	
	
	@Value("${cat.weight}")
	private int weight;
	
	public void display() {
		System.out.println("        With using @Value annotation: Here we are using @Value annotations to get the default values from value-annotation.properties file, In valueAnnotation.java class we used @PropertySource to define the properties file so that spring reads the file to assign the default properties. ");
		System.out.println("            Name: "+name);
		System.out.println("            Age: "+age);
		System.out.println("            Weight: "+weight);
	}
}
