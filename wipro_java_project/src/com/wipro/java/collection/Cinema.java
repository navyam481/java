package com.wipro.java.collection;

public class Cinema 
{
	/*
	 * Private properties
	 */
	private String movieName;
	private double rating;
	private int year;
	
	
	/*
	 * Parameterized constructor
	 */
	public Cinema(String movieName, double rating, int year) 
	{
		super();
		this.movieName = movieName;
		this.rating = rating;
		this.year = year;
	}

	/*
	 * Getters of Movie class
	 */
	public String getMovieName() {
		return movieName;
	}


	public double getRating() {
		return rating;
	}


	public int getYear() {
		return year;
	}
	
	
}
