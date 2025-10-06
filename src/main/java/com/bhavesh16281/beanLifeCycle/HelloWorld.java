package com.bhavesh16281.beanLifeCycle;


public class HelloWorld {
	
	public void describe() {
		
	}

    public void init() throws Exception {
    	System.out.println("1. Using XML Configuration ");
    	System.out.println("        Spring Bean HelloWorld has been instansiated.");
    }

    public void destroy() throws Exception {
        System.out.println("        Container has been closed, and I'm the destroy() method");
    }
}