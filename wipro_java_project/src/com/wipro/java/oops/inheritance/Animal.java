package com.wipro.java.oops.inheritance;



/**
 * POJO for Animal class
 * 
 * 	1. No constructor
 *  2. Getter have return value
 *  3. Setters have no return value
 *  4. Properties are determined using private fields 
 *	5. values are behaviors are determined through setters
 *  6. toString() will convert the entire animal class with properties and behaviors
 */
public class Animal {

	/**
	 * private  Properties of Animal = structure
	 */
	private String animalName; // Animal Name
	private int animalAge;     // Animal Age
	private String animalColor; // Animal Color
	private String animalType; // Animal Type
	

	/**
	 * Setters and Getters for Animal class
	 */

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = "Lion";
	}

	public int getAnimalAge() {
		return animalAge;
	}

	public void setAnimalAge(int animalAge) {
		this.animalAge = 10;
	}

	public String getAnimalColor() {
		return animalColor;
	}


	public void setAnimalColor(String animalColor) {
		this.animalColor = animalColor;
	}


	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	
	
	/**
	 * For printing the Animal Class Properties and behaviors
	 */

	@Override
	public String toString() {
		return "Animal [animalName=" + animalName + ", animalAge=" + animalAge + ", animalColor=" + animalColor
				+ ", animalType=" + animalType + "]";
	}

}
