package com.wipro.java_opps;

/**
 * POJO for Employee class
 * 
 * 	1. No constructor
 *  2. Getter have return value
 *  3. Setters have no return value
 *  4. Properties are determined using private fields 
 *	5. values are behaviors are determined through setters
 *  6. toString() will convert the entire animal class with properties and behaviors
 */

public class Employee
{

	/**
	 *  private  Properties of Employee = structure
	 */
	private int empId; // employee id
	private String empName; // employee name
	private int empAge; // employee age
	private String empDesignation; // employee designation

	/**
	 * Setters and Getters for Employee Class
	 */
	public int getEmpId() 
	{
		return empId;
	}
	
	public void setEmpId(int empId)
	{
		this.empId = empId;
	}
	
	public String getEmpName() 
	{
		return empName;
	}
	
	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}
	
	public int getEmpAge()
	{
		return empAge;
	}
	
	public void setEmpAge(int empAge) 
	{
		this.empAge = empAge;
	}
	
	public String getEmpDesignation() 
	{
		return empDesignation;
	}
	
	public void setEmpDesignation(String empDesignation)
	{
		this.empDesignation = empDesignation;
	}
	
	
}
