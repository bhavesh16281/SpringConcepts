package com.bhavesh16281.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gym {
	
	@Autowired
	private Dumbell dumbell;
	
	public void gymMethod() {
		dumbell.dumbellMethod();
	}

}
