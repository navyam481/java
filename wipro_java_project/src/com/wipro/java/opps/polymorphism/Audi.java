package com.wipro.java.opps.polymorphism;

/**
 * Parent class = Car
 * child class = Audi
 * Extends = is a keyword
 */
public class Audi extends Car {

	public static void main(String[] args) {
		/**
		 * here we are performing Dynamic Polymorphism
		 */
		Car a = new Audi(); 
		a.setCarBrand("Audi");
		a.setCarNumber("AP123");
		a.setCarColour("Red");
		a.setCarPrice(120000f);
		
		a.displayCarDetails();
	}

}
