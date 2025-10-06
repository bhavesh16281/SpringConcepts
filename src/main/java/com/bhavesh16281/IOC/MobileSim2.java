package com.bhavesh16281.IOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MobileSim2 {
	
	@Autowired
	@Qualifier ("airtel")
	public Sim sim;
	
	public void getSim() {
		sim.calling();
		sim.internet();
	}
}
