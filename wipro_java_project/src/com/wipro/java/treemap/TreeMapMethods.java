package com.wipro.java.treemap;
import java.util.*;

public class TreeMapMethods 
{

		 // Declaring a TreeMap
	    static TreeMap<Integer, String> treeMap;

	    // Method 1
	    // To create TreeMap
	    static void create()
	    {
	        // Creating an empty TreeMap
	    	treeMap = new TreeMap<Integer, String>(); // O(1)
	        System.out.println("TreeMap successfully created");
	    }

	    // Method 2
	    // To Insert values in the TreeMap
	    static void insert()
	    {
	        // Mapping string values to int keys using put()
	        // method
	    	 treeMap.put(1,"Apple");
	         treeMap.put(2,"Orange");
	         treeMap.put(3,"Pomogranate"); 
	         treeMap.put(4,"Grapes"); 
	         treeMap.put(5,"Banana"); 
	         treeMap.put(6,"Mango"); 
	         
	        System.out.println("Elements successfully inserted in the TreeMap");
	    }

	    // Method 3
	    // To search a key in TreeMap
	    static void search(int key)
	    {
	        System.out.println(
	            "\nIs key \"" + key + "\" present? "
	            + treeMap.containsKey(key)); 
	    }

	    // Method 4
	    // To search a value in TreeMap
	    static void search(String value)
	    {
	        System.out.println(
	            "\nIs value \"" + value + "\" present? "
	            + treeMap.containsValue(value));
	    }

	    // Method 5
	    // To display the elements in TreeMap
	    static void display()
	    {
	        System.out.println("\nDisplaying the TreeMap:");
	        System.out.println("TreeMap: " + treeMap);
	    }

	    // Method 6
	    // To traverse TreeMap
	    static void traverse()
	    {
	        System.out.println("\nTraversing the TreeMap:");
	        for (Map.Entry<Integer, String> e :
	        	treeMap.entrySet())
	            System.out.println(e.getKey() + " "
	                               + e.getValue());
	    }

	    // Method 6
	    // Main driver method
	    public static void main(String[] args)
	    {
	        // Calling above defined methods inside main()
	        create();
	        insert();
	        search(5);
	        search("Banana");
	        display();
	        traverse();
	    }
}


