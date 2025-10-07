package com.bhavesh16281.springExpressionLanguage;

public class Shirt {
	
	private int size;

	public void getSize() {
		System.out.println("1. SpEL in XML configuration file: ");
		System.out.println("        Size of Shirt is: "+size);
		System.out.println("        Here we are using expression language in expressionLanguage.xml to set the size.");
	}

	public void setSize(int size) {
		this.size = size;
	}
	

}
