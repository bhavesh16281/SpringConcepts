package com.bhavesh16281.springAnnotations;

import org.springframework.stereotype.Controller;

@Controller
public class Pencil {
	public void pencilMethod() {
		System.out.println("4. @Controller Annotation: ");
		System.out.println("        It is a specialization of @Component annotation,Used to mark class as Controller in spring MVC."
				+ " During COmponent scan spring detects the @Controller class as controller in MVC design pattern and registers the class as bean.");
	}
}
