package com.wipro.java.java8;

@FunctionalInterface
interface ShapeInterface
{
	// Single abstract method
	
	void square(int side);
	
	/*
	 * Default method in interface introduced from Java 1.8v onwards
	 */
	
	default void rectangle(int length , int breadth)
	{
		System.out.println("Shape is Rectangle");
		System.out.println("Rectangle area : "+(length*breadth));
	}
	
	default double traingle(int length , int breadth)
	{
		System.out.println("Shape is Traingle");
		return (0.5*length*breadth);
	}
	
	
	/*
	 * Static method in interface introduced from Java 1.8v onwards
	 */
	
	static void circle(int radius)
	{
		System.out.println("Shape is Circle");
		System.out.println("Area of the circle : "+(3.14*radius*radius));
	}
	
	static String sphere(int radius)
	{
		System.out.println("Shape is Sphere");
		return "Area of the sphere : "+(4*3.14*radius*radius);
	}
	
}



public class Shapes  implements ShapeInterface
{

	@Override
	public void square(int side)
	{
		System.out.println("Shape is Square");
		System.out.println("Area of the Square : "+(side*side));
	}
	
	public static void main(String[] args) 
	{
		Shapes obj1 = new Shapes();
		
		/**
		 * Calling abstract method which overridden
		 */
		obj1.square(5);
		
		System.out.println(".............................................");
		
		
		/**
		 * Calling default method using object reference
		 */
		obj1.rectangle(3, 5);
		double areaOfTraingle = obj1.traingle(2, 3);
		System.out.println("Area of Traingle : "+areaOfTraingle);
		
		System.out.println(".............................................");
		
		/**
		 * Calling static method of Interface -> ShapeInterce
		 * using Interface Name : ShapeInterface
		 */
		ShapeInterface.circle(4);
		System.out.println(ShapeInterface.sphere(5));
		
	}
}
