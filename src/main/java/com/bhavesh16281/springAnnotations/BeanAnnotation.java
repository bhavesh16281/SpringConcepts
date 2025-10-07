package com.bhavesh16281.springAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanAnnotation {
	
	@Bean
	public House houseBean() {
		return new House();
	}
}
