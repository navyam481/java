/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**
 * Parent class = Employee
 * child class = Manager
 * Extends = is a keyword
 */
public class Manager extends Employee{

	/**
	 * 
	 */
	public Manager() {
		
	}
	
	public static void main(String[] args) {
		
		
		

		/*
		 *  Syntactically correct but it is not possible
		 */
		//Manager manager2 = (Manager) new Employee();
		
		
		/**
		 * Child object is instantiated from child constructor
		 * Parent class consumes the properties and behaviors of child class
		 */
		Employee manager1 = new Manager();
		
		manager1.setEmpId(101);
		manager1.setEmpName("M Navyasree");
		manager1.setEmpAge(22);
		manager1.setEmpDesignation("Manager");
		
		System.out.println(manager1.getEmpId());
		System.out.println(manager1.getEmpName());
		System.out.println(manager1.getEmpAge());
		System.out.println(manager1.getEmpDesignation());
	}

}
