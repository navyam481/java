package com.wipro.java.interface1;

public class Cuckoo implements Bird
{

	/**
	 * Overriding the abstract method
	 */

	@Override
	public void fly()
	{
		System.out.println("Cuckoo is flying");
	}
	
	public static void main(String[] args) 
	{
		Bird cuckoo = new Cuckoo();
		cuckoo.fly();

	}

}
