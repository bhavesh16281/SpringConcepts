package com.bhavesh16281.springAnnotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan (basePackageClasses = com.bhavesh16281.springAnnotations.Cat.class)
@PropertySource("classpath:com/bhavesh16281/value-annotation.properties")

public class valueAnnotation {

}
