package com.bhavesh16281.constructorInjection;

public class Car {
	
	public void carMethod() {
		System.out.println("	In Constructor Injection spring will automatically create all the dependencies using constructors.");
		System.out.println("    	Here From App.java we have created a bean for ConstructurInjection.java which is dependent on Car object.");
		System.out.println("    	So inside the constructor of ConstructurInjection.java we have requested spring to create car dependency by adding constructor-arg tag in constructorConfig.xml");
	}

}
