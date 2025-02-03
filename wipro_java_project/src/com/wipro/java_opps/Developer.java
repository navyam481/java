/**
 * 
 */
package com.wipro.java_opps;

/**
 * Parent class = Employee
 * child class = Developer
 * Extends = is a keyword
 */
public class Developer extends Employee{

	/**
	 * 
	 */
	public Developer() {
		// TODO Auto-generated constructor stub
	}

	
	
	public static void main(String[] args) 
	{
		/**
		 * Child object is instantiated from child constructor
		 * Parent class consumes the properties and behaviors of child class
		 */
		
		
		Employee developer = new Developer();
		
		developer.setEmpId(111);
		developer.setEmpName("M Navyasree");
		developer.setEmpAge(22);
		developer.setEmpDesignation("Developer");
		
		System.out.println(developer.getEmpId());
		System.out.println(developer.getEmpName());
		System.out.println(developer.getEmpAge());
		System.out.println(developer.getEmpDesignation());
	}
	
}
