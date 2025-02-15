package com.spring.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");		
		Employee emp = context.getBean(Employee.class);
		Employee1 emp1 = context.getBean(Employee1.class);
		emp.display();
		emp1.show();
	}
}
