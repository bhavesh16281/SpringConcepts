package com.bhavesh16281.springAnnotations;

import org.springframework.stereotype.Repository;

@Repository
public class Course {
	
	public void courseMethod() {
		System.out.println("8. @Repository Annotation: ");
		System.out.println("        @Repository Annotation is a specialization of the @Component annotation, which is used to indicate that the class provides the mechanism for storage, retrieval, update, delete, and search operation on objects."
				+ " The main purpose of the @Repository annotation is to interact with a database. It encapsulates the logic required to access and manipulate data");
	}
}
