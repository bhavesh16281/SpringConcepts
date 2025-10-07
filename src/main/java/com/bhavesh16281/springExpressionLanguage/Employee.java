package com.bhavesh16281.springExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
	
	
	private double salary;

	public void getSalary() {
		System.out.println("2. Using SpEL with Annotations");
		System.out.println("        Salary of Employee is: "+salary);
		System.out.println("        Here we are using expression language in @Value annotation to set the salary.");
	}
	
	@Value ("#{45000}")
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
