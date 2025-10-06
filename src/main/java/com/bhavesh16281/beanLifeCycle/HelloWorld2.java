package com.bhavesh16281.beanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld2 implements InitializingBean,DisposableBean {

	@Override
	public void afterPropertiesSet() throws Exception
	{
		System.out.println("2. Using Programmatic Approach (Interface)");
		System.out.println("        Spring Bean HelloWorld2 has been instansiated.");
	}

	@Override
	public void destroy() throws Exception
	{
		System.out.println("        Container has been closed "+ "and I'm the destroy() method");
	}
}
