package com.wipro.java.interface1;

public class Paint implements Drawable , Showable
{
	
	@Override
	public void show() 
	{
		System.out.println("Drawing the pictures");
	}

	@Override
	public void draw() 
	{
		System.out.println("showing the pictures");
	}

	public static void main(String[] args) 
	{
		Paint paint1 = new Paint();
		paint1.draw();
		paint1.show();
		
		
		System.out.println("............................");
		
		Drawable paint2 = new Paint();
		paint2.draw();
		
		Showable paint3 = new Paint();
		paint3.show();
	}

}
