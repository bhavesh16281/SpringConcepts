package com.bhavesh16281.IOC;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("jio")
public class Jio implements Sim {

	@Override
	public void calling() {
		System.out.println("        Calling from Jio Sim");

	}

	@Override
	public void internet() {
		System.out.println("        Internet accessed from Jio Sim");
	}

}
