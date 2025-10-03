package com.bhavesh16281.IOC;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Airtel implements Sim{

	@Override
	public void calling() {
		System.out.println("        Calling from Airtel Sim");
	}

	@Override
	public void internet() {
		System.out.println("        Internet accessed from Airtel Sim");
	}

}
