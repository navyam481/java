package com.wipro.java.usecase2;

public interface StudentOperations
{
	/**
	 * All are by default
	 * public abstract method
	 */
	
	/*
     *Abstract Method to add the student details
     */
    void addStudent(Student s);
    
    
    void addStudent(String id, String name, int age, String address); // Overloaded method
    
    
    /*
     * Method to delete the student details
     */
    void deleteStudent(String id);
    
    /*
     * Method to display all the student details
     */
    void displayStudents();
    
    
    /*
     *to search the student based on id
     */
    void searchStudent(String id);
    
    /*
     *to update the student name based on id
     */
    void updateName(String id, String newName);
    
    
    /*
     * to update the student address based on id
     */
    void updateAddress(String id, String newAddress);
    
    /*
     * to update the student age based on id
     */
    void updateAge(String id, int newAge);
    
    /*
     * to sort the student details based on Address  in Ascending order
     */
    void sortByAddress();
    
    /*
     * to sort the student details  based on age in Descending order
     */
    void sortByAge();
}
