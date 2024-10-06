package com.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee e = (Employee) ap.getBean("e");

		System.out.println(e);
	}
   }