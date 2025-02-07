package com.wipro.java.java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamAPI {

	public StreamAPI() {
		
	}

	public static void main(String[] args) {
	
		/**
		 * List of names using Arrays.asList()
		 */
		List<String> list = Arrays.asList("Navya","Swathi","Naveena","Nandhu","Srinu");
	
		// converting into stream and retrieving names starts with "N" 
		// using filter() method from stream class
		List<String> stream1 = list.stream().filter(name->name.startsWith("N")).collect(Collectors.toList());
		System.out.println(stream1);
		
		
		
		// converting into stream and converting names into UpperCase
		// using map() method from stream class
		List<String> names = Arrays.asList("Navya","Swathi","Naveena","Nandhu","Srinu");
		List<String> stream2 = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(stream2);
		
	}

}