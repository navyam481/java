package com.wipro.java.oops.task;



public class PublicLibrary extends Library 
{
	private String location;

	// Constructor (Encapsulation: Private field location)
	
	public PublicLibrary(String name, int booksAvailable, String location) {
		
		super(name, booksAvailable); // Calls the parent class (Library) constructor
		this.location = location;
	}

	// Getter for location
	public String getLocation() {
		return location;
	}

	// Polymorphism: Overriding abstract method
	@Override
	public void libraryServices() {
		System.out.println(getName() + " offers all kind of books, reading rooms, and community events.");
	}
	
	
	
	public static void main(String[] args) 
	{
		// Creating instances using Polymorphism
			
		Library lib = new PublicLibrary("Public Library", 5000, "Hyderabd");
			

		// Method calls (Runtime Polymorphism)
			
		lib.displayInfo();
		lib.libraryServices();

	}	
}
