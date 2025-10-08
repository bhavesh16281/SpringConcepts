package com.bhavesh16281.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class QualifierTest {
	
	@Autowired
	@Qualifier ("animalHeart")
	public Heart heart;
	
	public void getMethod() {
		System.out.println("6. @Qualifier Annotation: ");
		heart.pump();
	}
	
	

}
