package com.wipro.usecase;
import java.util.*;


public class HashMapStudentdata 
{
	public static void main(String[] args) 
	{
		/*
		 * creating hashmap object with duplicate keys and values
		 */
		Map<String,Integer> students = new HashMap<String,Integer>();
		students.put("Smith",1);
		students.put("Allens",2);
		students.put("Adem",3);
		students.put("Smith",4); // name duplicates
		students.put("Scott",5);
		students.put("King",5);	 // roll number duplicates 
		students.put("Adem",7); // name duplicates
		students.put("Berlin",8);
		students.put("Turner",9);
		students.put("Blake",10);
		
		
		/**
		 * Key should be unique --> if we try to duplicate
		 *  old value is replaced with new value
		 *  
		 *  
		 *  value can be duplicate
		 */
		
		System.out.println(students);
	}
	
}
