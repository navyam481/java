package com.wipro.java.opps.polymorphism;

/**
 * Parent class = Car
 * child class = Maruthi
 * Extends = is a keyword
 */
public class Maruthi extends Car {

	public static void main(String[] args)
	{
		
		/**
		 * here we are performing Dynamic Polymorphism
		 */
		Car m = new Maruthi();  
		m.setCarBrand("Maruthi");
		m.setCarNumber("AP222");
		m.setCarColour("Blue");
		m.setCarPrice(200000f);
		
		m.displayCarDetails();
	}

}
