package com.wipro.java.hashmap;
import java.util.*;

public class ChangingValues
{

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

	    // change element with key Berlin
		    students.replace(106,"James");
	    System.out.println("HashMap using replace(): " + students);
	  }
	
}
