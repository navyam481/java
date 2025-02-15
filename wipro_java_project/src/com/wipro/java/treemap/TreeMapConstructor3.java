package com.wipro.java.treemap;

import java.util.TreeMap;

public class TreeMapConstructor3 
{
	 static void Example3rdConstructor()
	    {
	        // Creating an empty HashMap
		  TreeMap<Integer,String> treeMap = new TreeMap<>();
	        
		     /**
		      *  Adding elements to the tree map
		      */
		        treeMap.put(1,"Apple");
		        treeMap.put(2,"Orange");
		        treeMap.put(3,"Pomogranate"); 
		        treeMap.put(4,"Grapes"); 
		        treeMap.put(5,"Banana"); 
		        treeMap.put(6,"Mango"); 

	        // Printing the elements of TreeMap
	        System.out.println("TreeMap: " + treeMap); // O(n)
	    }
	 public static void main(String[] args) {
		 System.out.println("TreeMap using TreeMap(Map) constructor:\n");
		        Example3rdConstructor();
	}
}
