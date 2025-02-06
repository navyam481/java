package com.wipro.java.collection;

import java.util.*;

/**
 * Comparable (I) for sorting the objects
 */
class Animal implements Comparable<Animal>
{
	/*
	 * Private properties
	 */
	private String animalName;
	private int animalAge;
	private double animalWeight;
	
	/*
	 * Parameterized constructor
	 */
	public Animal(String animalName, int animalAge, double animalWeight) {
		super();
		this.animalName = animalName;
		this.animalAge = animalAge;
		this.animalWeight = animalWeight;
	}

	@Override
	public int compareTo(Animal animal) 
	{
		/**
		 * Sorting Based on Animal Age
		 */
		return this.getAnimalAge() - animal.getAnimalAge();
	}

	/*
	 * Getters of Animal Class
	 */
	public String getAnimalName() {
		return animalName;
	}

	public int getAnimalAge() {
		return animalAge;
	}

	public double getAnimalWeight() {
		return animalWeight;
	}
	
}

public class AnimalSorting implements Comparator<Animal>
{

	/*
	 * Abstract method of Comparator(I) 
	 */
	
	@Override
	public int compare(Animal a1, Animal a2) {
		
		/**
		 * Sorting the Animal based on animal name
		 */
		return a1.getAnimalName().compareTo(a2.getAnimalName());
	}

	
	
	public static void main(String[] args) 
	{
		/**
		 *  Creating the list of animals using ArrayList
		 */

		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("Tiger",10,55.5));
		animals.add(new Animal("Lion",12,68.0));
		animals.add(new Animal("Dog",5,15.1));
		animals.add(new Animal("Rabbit",8,10.3));
		animals.add(new Animal("Deer",9,70.0));
		animals.add(new Animal("Fox",7,34.5));
		
		/**
		 * Calling sort method from Collections class to sort animals
		 * it will call the overridden  sort method in Animal class
		 */
		Collections.sort(animals);
		
		/*
		 * Fetching after sorting
		 */
		System.out.println("ArrayList Objects after sorting based on the Age");
		System.out.println("______________________________________________________");
		
		for(Animal a : animals)
		{
			System.out.println("Animal Name : "+a.getAnimalName()+" , Age : "+a.getAnimalAge()+" , Weight : "+a.getAnimalWeight());
		}

		
		
		System.out.println("............................................................................");
		
		
		
		/**
		 * Calling sort method from Collections class to sort animals
		 * it will call the overridden  sort method in AnimalSorting class
		 */
		Collections.sort(animals , new AnimalSorting());
		
		/*
		 * Fetching after sorting
		 */
		System.out.println("ArrayList Objects after sorting based on the Name");
		System.out.println("______________________________________________________");
		
		for(Animal a : animals)
		{
			System.out.println("Animal Name : "+a.getAnimalName()+" , Age : "+a.getAnimalAge()+" , Weight : "+a.getAnimalWeight());
		}
		
	}

	
}
