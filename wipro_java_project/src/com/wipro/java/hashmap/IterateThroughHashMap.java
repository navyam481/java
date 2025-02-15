package com.wipro.java.hashmap;

import java.util.*;
public class IterateThroughHashMap {
	public static void main(String[] args) {
		 // create a hashmap
	    HashMap<String, Integer> students = new HashMap<>();

	    // add elements to hashmap
	    students.put("Smith", 101);
	    students.put("Scott", 102);
	    students.put("David", 103);
	    students.put("King", 104);
	    students.put("Turner", 105);
	    students.put("Berlin", 106);
	    
	    
	    // printing hashmap
	    System.out.println("HashMap: " + students);

	    // iterate through keys only
	    System.out.print("Keys: ");
	    for (String key : students.keySet()) {
	      System.out.print(key);
	      System.out.print(", ");
	    }

	    // iterate through values only
	    System.out.print("\nValues: ");
	    for (Integer value : students.values()) {
	      System.out.print(value);
	      System.out.print(", ");
	    }
	    
	    // iterate through key/value entries
	    System.out.print("\nEntries: ");
	    for (Map.Entry<String,Integer> entry : students.entrySet()) {
	      System.out.print(entry);
	      System.out.print(", ");
	}
 }
}
