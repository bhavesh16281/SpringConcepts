package com.bhavesh16281.IOC;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = "com.bhavesh16281.IOC")
public class AppConfigAnnotation {
	public AppConfigAnnotation() {
		System.out.println("bjsbj");
	}
}
