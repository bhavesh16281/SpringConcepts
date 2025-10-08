package com.bhavesh16281.springAnnotations;


public class Dog {

	private String name;
	private int age;
	private double weight;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void display() {
		System.out.println("5. @Value Annotation: ");
		System.out.println("        Without using @Value annotation: Configured the Dog bean in valueAnnotation.xml and vales are taken from value-annotation.properties file");
		System.out.println("            Name: "+getName());
		System.out.println("            Age: "+getAge());
		System.out.println("            Weight: "+getWeight());
	}
}
