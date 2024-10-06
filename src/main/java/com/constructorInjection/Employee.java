package com.constructorInjection;

public class Employee {
	
	private String name;
	private String emailId;
	
	
	//for constructor injection create paramaterised constructor
	public Employee(String name, String emailId) {
		super();
		this.name = name;
		this.emailId = emailId;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", emailId=" + emailId + "]";
	}
	
	
	

}
