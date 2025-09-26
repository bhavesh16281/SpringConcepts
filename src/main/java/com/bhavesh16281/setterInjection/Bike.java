package com.bhavesh16281.setterInjection;

public class Bike {
	
	public void bikeMethod() {
		System.out.println("	In Setter Injection spring will automatically create all the dependencies using Setters.");
		System.out.println("    	Here from App.java we have created a bean for ConstructorInjection.java which is dependent on Bike object.");
		System.out.println("        So inside the setBike method of SetterInjection.java we have requested spring to create bike dependency by adding property tag in setterConfig.xml");

	}

}
