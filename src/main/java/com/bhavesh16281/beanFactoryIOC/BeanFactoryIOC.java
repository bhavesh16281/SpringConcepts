package com.bhavesh16281.beanFactoryIOC;

public class BeanFactoryIOC {
	
	private Laptop laptop;

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
		this.laptop.laptopMethod();
	}
	
	

}
