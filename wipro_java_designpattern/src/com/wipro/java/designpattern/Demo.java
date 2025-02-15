package com.wipro.java.designpattern;

import java.util.Scanner;

import com.wipro.java.factories.*;

public class Demo 
{
	 private static Application configureApplication() 
	 {
	        Application app;
	        GUIFactory factory;
	        Scanner sc = new Scanner(System.in);
	        String osName = System.getProperty("os.name").toLowerCase();
	        
	        if (osName.contains("mac")) 
	        {
	            factory = new MacOSFactory();
	        } 
	        else 
	        {
	            factory = new WindowsFactory();
	        }
	        
	        app = new Application(factory);
	        return app;
	  }

	  public static void main(String[] args) {
	       Application app = configureApplication();
	       app.paint();
	  }
}
