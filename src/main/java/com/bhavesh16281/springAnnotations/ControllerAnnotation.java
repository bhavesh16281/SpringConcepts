package com.bhavesh16281.springAnnotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Pencil.class)
public class ControllerAnnotation {

}
