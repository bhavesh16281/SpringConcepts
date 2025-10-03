package com.bhavesh16281.IOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MobileSim {
	
//	@Autowired
//	@Qualifier("jio")
	private  Sim sim;
	
	
	@Autowired
	public MobileSim(Sim sim) {
		this.sim = sim;
	}



	public void useSim() {
		sim.calling();
		sim.internet();
	}
}
