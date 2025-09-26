package com.bhavesh16281.constructorInjection;

public class ConstructorInjection {
	
	private Car car;
	
	
    public ConstructorInjection(Car car) {
    	System.out.println("1. Constructor Injection:");
		this.car = car;
		this.car.carMethod();
		
	}

}
