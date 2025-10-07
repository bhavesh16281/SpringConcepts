package com.bhavesh16281.springAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationAnnotation {
	
	@Bean
	public Book bookBean() {
		return new Book();
	}
}
