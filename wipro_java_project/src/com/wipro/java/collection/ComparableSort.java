package com.wipro.java.collection;
import java.util.*;

/**
 * Comparable (I) for sorting the objects
 */
class Movie implements Comparable<Movie>
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
	public Movie(String movieName, double rating, int year) 
	{
		super();
		this.movieName = movieName;
		this.rating = rating;
		this.year = year;
	}


	/*
	 * Abstract method of Comparable(I) 
	 */
	@Override
	public int compareTo(Movie movie) 
	{
		/**
		 * Sorting the movie based on rating
		 */
		return (int) (this.rating - movie.rating) ;
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

public class ComparableSort
{
	public static void main(String[] args)
	{
		/**
		 *  Creating the movie list using ArrayList
		 */
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie("HomeAlone",5.5,1999));
		movieList.add(new Movie("Amigos",5.3,2004));
		movieList.add(new Movie("Avatar2",9.8,2023));
		movieList.add(new Movie("HarryPorter",10.0,2008));
		movieList.add(new Movie("Fall",7.8,1992));
		movieList.add(new Movie("Encantico",5.0,2010));
		
		
		/**
		 * Calling sort method from Collections class to sort movie list
		 * it will call the overridden  sort method in Movie class
		 */
		Collections.sort(movieList);
		
		
		/*
		 * Fetching after sorting
		 */
		System.out.println("ArrayList Objects after sorting based on the rating");
		
		for(Movie m :movieList)
		{
			System.out.println("Movie name :"+m.getMovieName()+" , Movie Rating : "+m.getRating()+" Released Year : "+m.getYear());
		}
	}
}