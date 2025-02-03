/**
 * 
 */
package com.wipro.java_opps;

/**
 * Parent class = Employee
 * child class = ProjectLead
 * Extends = is a keyword
 */
public class ProjectLead extends Employee{

	/**
	 * 
	 */
	public ProjectLead() {
		
	}

	
	
	public static void main(String[] args) 
	{
		/**
		 * Child object is instantiated from child constructor
		 * Parent class consumes the properties and behaviors of child class
		 */
		
		
		Employee projectLead = new ProjectLead();
		
		projectLead.setEmpId(121);
		projectLead.setEmpName("M Navyasree");
		projectLead.setEmpAge(22);
		projectLead.setEmpDesignation("ProjectLead");
		
		System.out.println(projectLead.getEmpId());
		System.out.println(projectLead.getEmpName());
		System.out.println(projectLead.getEmpAge());
		System.out.println(projectLead.getEmpDesignation());
		
	}
}
