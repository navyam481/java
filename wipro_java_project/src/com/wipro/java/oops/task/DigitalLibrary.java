package com.wipro.java.oops.task;

public class DigitalLibrary extends Library{

	private String location;

	// Constructor (Encapsulation: Private field location)
	public DigitalLibrary(String name, int booksAvailable, String location) 
	{
		
		super(name, booksAvailable); // Calls the parent class (Library) constructor
		this.location = location;
	}

	// Getter for location
	public String getLocation()
	{
		return location;
	}

	
	// Polymorphism: Overriding abstract method
		@Override
	public void libraryServices() 
	{
		System.out.println(getName() + " offers all kind of books, reading rooms, and community events.");
	}

		
	// Main method inside the child class
	public static void main(String[] args) 
	{
		// Creating instances using Polymorphism
			
		Library lib = new DigitalLibrary("Digital Library", 10000, "Banglore");
			

		// Method calls (Runtime Polymorphism)
			
		lib.displayInfo();
		lib.libraryServices();

	}	
		
}
