package com.bhavesh16281.beanLifeCycle;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld3 {
	@PostConstruct
	public void init() throws Exception
	{
		System.out.println("3. Using Annotations");
		System.out.println("        Bean HelloWorld3 has been "	+ "instantiated and I'm the " + "init() method");
	}

	@PreDestroy
	public void destroy() throws Exception
	{
		System.out.println("        Container has been closed " + "and I'm the destroy() method");
	}
}