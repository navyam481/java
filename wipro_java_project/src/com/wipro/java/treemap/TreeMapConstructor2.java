package com.wipro.java.treemap;

import java.util.Comparator;
import java.util.TreeMap;

class Product
{
	int prodId;
	String prodName;
	
	public Product(int prodId, String prodName) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + "]";
	}
		
}

class SortById implements Comparator<Product>
{

	@Override
	public int compare(Product p1, Product p2) {
		return p1.prodId-p2.prodId;
	}
	
}
public class TreeMapConstructor2 
{
	 static void Example2ndConstructor()
	    {
	        TreeMap<Product, Double> tree_map = new TreeMap<Product, Double>(new SortById()); 

	        /**
	         * Adding custom objects in treemap
	         */
	        tree_map.put(new Product(111,"Camera"), 34555D);
	        tree_map.put(new Product(222,"Mobile"), 50000D);
	        tree_map.put(new Product(333,"TV"), 75000D);
	        tree_map.put(new Product(444,"Laptop"), 65000D);
	        tree_map.put(new Product(555,"Fridge"), 67500D);
	        System.out.println("TreeMap: " + tree_map); 
	    }
	public static void main(String[] args) 
	{
		System.out.println("TreeMap using TreeMap(Comparator) constructor:\n");
	        Example2ndConstructor(); 
	}
}
