package com.bhavesh16281.IOC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Sim jio() {
		return new Jio();
	}
	
	@Bean
	public Sim airtel() {
		return new Airtel();
	}

}
