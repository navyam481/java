package com.wipro.java.oops.encapsulation;

public class Animal 
{
	
	/*
	 * Private properties fields
	 */
	private String animalName;
	private int animalAge;
	
	
	/**
	 * Parameterized constructor
	 */
	
	public Animal(String animalName, int animalAge) {
		super(); //calls the root parent class=object
		this.animalName = animalName;
		this.animalAge = animalAge;
	}


	
	/**
	 * Setters and Getters of Animal class
	 */
	public String getAnimalName() 
	{
		return animalName;
	}


	public void setAnimalName(String animalName)
	{
		this.animalName = animalName;
	}


	public int getAnimalAge()
	{
		return animalAge;
	}


	public void setAnimalAge(int animalAge) 
	{
		
		/**
		 * checking validation
		 */
		if(animalAge>0)
		{
			this.animalAge = animalAge;
		}
		else
		{
			System.out.println("Age must be positive");
		}
	}
	
	
	
	public static void main(String[] args)
	{
		Animal animal1 = new Animal("Dog",4);
		System.out.println(animal1.getAnimalName());
		System.out.println(animal1.getAnimalAge());
		
		Animal animal2 = new Animal("Lion",10);
		animal2.setAnimalAge(12);
		System.out.println(animal2.getAnimalName());
		System.out.println(animal2.getAnimalAge());
		
		animal1.setAnimalAge(-2);
	}
}
