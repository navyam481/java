package com.wipro.java.treemap;

import java.util.TreeMap;

public class TreemapConstructor1
{
	 // To show TreeMap constructor
    static void Example1stConstructor()
    {
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
    }     
	public static void main(String[] args) 
	{
		 System.out.println("TreeMap using TreeMap() constructor:\n");

		 // Calling constructor
		 Example1stConstructor();
	}
	    	
}
