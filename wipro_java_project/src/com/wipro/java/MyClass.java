/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class MyClass 
{
    int num = 5;
 
    public void changeValue(int num) 
    {
        this.num = num;
    }

    public static void main(String[] args) 
    {
    	MyClass obj = new MyClass(); // Creating object for the MyClass class
        obj.changeValue(10); // calling method of MyClass method using Object reference
        System.out.println(obj.num); // Printing the value
    }
}