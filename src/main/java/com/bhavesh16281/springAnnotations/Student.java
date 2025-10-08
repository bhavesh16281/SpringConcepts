package com.bhavesh16281.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Autowired
	private Course course;
	
	public void studentMethod() {
		course.courseMethod();
	}
}
