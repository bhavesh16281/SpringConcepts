package com.bhavesh16281.fieldInjection;

import org.springframework.beans.factory.annotation.Autowired;

public class FieldInjection {
	
	@Autowired
	private Cycle cycle;
	
	public void getCycleMethod() {
		cycle.cycleMethod();
	}
	
}
