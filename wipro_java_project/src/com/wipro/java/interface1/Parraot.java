package com.wipro.java.interface1;

public class Parraot implements Bird
{
	/**
	 * Overriding the abstract method
	 */

	@Override
	public void fly() {
		System.out.println("Parrat is flying");
	}

	public static void main(String[] args) 
	{
		Bird parrot = new Parraot();
		parrot.fly();
	}
	
	
}
