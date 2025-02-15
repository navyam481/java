package com.wipro.java.hashmap;
import java.util.*;

public class AccessingElements {


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
	    
	    
	    // return set view of keys
	    // using keySet()
	    System.out.println("Keys: " + students.keySet());

	    // return set view of values
	    // using values()
	    System.out.println("Values: " + students.values());

	    // return set view of key/value pairs
	    // using entrySet()
	    System.out.println("Key/Value mappings: " + students.entrySet());
	  }
	
}
