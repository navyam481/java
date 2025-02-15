package com.wipro.java.hashmap;

import java.util.HashMap;

public class RemoveElements {
  public static void main(String[] args) {

	  // create a hashmap
	    HashMap<Integer, String> students = new HashMap<>();

	    // add elements to hashmap
	    students.put( 101,"Smith");
	    students.put(102,"Scott" );
	    students.put( 103,"David");
	    students.put(104,"King");
	    students.put(105,"Turner");
	    students.put(106,"Berlin");
	    
	    // printing hashmap
	    System.out.println("HashMap: " + students);  

    // remove element associated with key 102
    String value = students.remove(103);
    System.out.println("Removed value: " + value);

    System.out.println("Updated HashMap: " + students);
  }
}
