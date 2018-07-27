package com.sree.design.model;
/*Factory Design Pattern Super Class
Super class in factory design pattern can be an interface, abstract class or a normal java class. For our factory design pattern example, we have abstract super class with overridden toString() method for testing purpose.
*/
public abstract class Computer {
	
	public abstract String getRam();
	public abstract String getHDD();
	public abstract String getCPU();
	
	public String toString(){
		
		return "Ram="+this.getRam()+",HDD="+this.getHDD()+",CPU="+this.getCPU();
	}
	
}