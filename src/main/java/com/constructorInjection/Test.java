package com.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Employee employee = (Employee) ap.getBean("emp");
		System.out.println(employee);
	}
}
