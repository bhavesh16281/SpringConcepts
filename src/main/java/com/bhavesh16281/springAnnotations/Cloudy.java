package com.bhavesh16281.springAnnotations;

public class Cloudy {
	
	public void cloudyMethod() {
		System.out.println("        Using XML Configuration: ");
		System.out.println("            In XML based configuration we declared all the beans definitions in autowiredAnnotation.xml file and mentioned  <context:annotation-config/>"
				+ " Now while creating bean for Sky.java when there is a dependency of CLoudy.java If the dependency is annotated with @Autowired spring will read the xml file and inject the bean to Sky.java.");
	}

}
