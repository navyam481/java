package com.wipro.java.interface1;

public class Sparrow implements Bird
{
	/**
	 * Overriding the abstract method
	 */

	@Override
	public void fly()
	{
		System.out.println("Sparrow is flying");
	}
	
	public static void main(String[] args) 
	{
		Bird sparrow = new Sparrow();
		sparrow.fly();

	}

	

}
