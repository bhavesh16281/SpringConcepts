package com.bhavesh16281.setterInjection;

public class SetterInjection {
	
	private Bike bike;

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		System.out.println("2. Setter Injection:");
		this.bike = bike;
		this.bike.bikeMethod();
	}
	

}
