package com.wipro.java.usecase2;


/*
 * Parent class : Person
 * child class : Student
 */
public class Student extends Person 
{

	/*
	 * Private properties of Person class
	 */
	
    private String studentId;
    private final String collegeName = "IIIT-RK Valley";

    /*
     * Parameterized constructor
     */
    public Student(String studentId, String name, int age, String address) 
    {
        super(name, age, address);
        this.studentId = studentId;
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student [ID=" + studentId + ", Name=" + getName() + ", Age=" + getAge() +
                ", Address=" + getAddress() + ", College=" + collegeName + "]");
    }
}
