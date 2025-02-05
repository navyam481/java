/**
 * 
 */
package com.wipro.java.opps.polymorphism;

/**
 * POJO for Car class
 * 
 * 	1. No constructor
 *  2. Getter have return value
 *  3. Setters have no return value
 *  4. Properties are determined using private fields 
 *	5. values are behaviors are determined through setters
 *  6. toString() will convert the entire animal class with properties and behaviors
 */
public class Car 
{
	
	/*
	 * private  Properties of Car = structure
	 */
	private String carBrand;
	private String carNumber;
	private String carColour;
	private float carPrice;
	
	
	/*
	 * Setters and Getters for Car class
	 */
	
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarColour() {
		return carColour;
	}
	public void setCarColour(String carColour) {
		this.carColour = carColour;
	}
	public float getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(float carPrice) {
		this.carPrice = carPrice;
	}
	
	/**
	 * For printing the Car Class Properties and behaviors
	 */
	
	public void displayCarDetails()
	{
		System.out.println("Car Brand : "+this.carBrand);
		System.out.println("Car Number : "+this.carNumber);
		System.out.println("Car Color : "+this.carColour);
		System.out.println("Car Price : "+this.carPrice);
	}
	
	
}
