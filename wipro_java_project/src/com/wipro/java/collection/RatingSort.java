package com.wipro.java.collection;

import java.util.*;

public class RatingSort  implements Comparator<Cinema>
{

	/*
	 * Abstract method of Comparator(I) 
	 */
	
	@Override
	public int compare(Cinema m1, Cinema m2) {
		
		/**
		 * Sorting the movie based on rating
		 */
		return Double.compare(m1.getRating(), m2.getRating());
	}
	
	public static void main(String[] args)
	{
		
		/**
		 *  Creating the movie list using ArrayList
		 */
		ArrayList<Cinema> movieList = new ArrayList<Cinema>();
		movieList.add(new Cinema("HomeAlone",5.5,1999));
		movieList.add(new Cinema("Amigos",5.3,2004));
		movieList.add(new Cinema("Avatar2",9.8,2023));
		movieList.add(new Cinema("HarryPorter",10.0,2008));
		movieList.add(new Cinema("Fall",7.8,1992));
		movieList.add(new Cinema("Encantico",5.0,2010));
		
		Collections.sort(movieList, new RatingSort());
		
		/*
		 * Fetching after sorting
		 */
		System.out.println("ArrayList Objects after sorting based on the rating");
		System.out.println("__________________________________________________________");
		
		for(Cinema m :movieList)
		{
			System.out.println("Movie name :"+m.getMovieName()+" , Movie Rating : "+m.getRating()+" Released Year : "+m.getYear());
		}
	}

}
