package com.bhavesh16281.applicationContextIOC;

public class ApplicationContextIOC {
	
	private Mobile mobile;

	
	public ApplicationContextIOC(Mobile mobile) {
		this.mobile = mobile;
		this.mobile.mobileMethod();

	}


}
