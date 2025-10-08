package com.bhavesh16281.springAnnotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackageClasses = com.bhavesh16281.springAnnotations.TV.class)
public class ServiceAnnotation {

}
