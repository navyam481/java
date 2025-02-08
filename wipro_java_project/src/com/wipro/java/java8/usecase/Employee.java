package com.wipro.java.java8.usecase;

import java.time.LocalDate;

public class Employee 
{
	
	/*
	 * private properties of Employee class
	 */
	private int empId;
	private String empName;
	private String department;
	private double salary;
	private LocalDate joiningDate;
	
	/*
	 * Parameterized class
	 */
	public Employee(int empId, String empName, String department, double salary, LocalDate joiningDate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.department = department;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}
	
	
	
	/*
	 * Getters and Setters
	 */
	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	
	/*
	 * toString method to print all the details of employee 
	 */
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department + ", salary=" + salary
				+ ", joiningDate=" + joiningDate + "]";
	}

}
