package com.setterInjection;

//create a spring bean class "Employee"
public class Employee {
	
	private String name;
	private String city;
	
	//for setter injection provide only setter method
	
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	//to get the respective value in main class override toString() method
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + "]";
	}
	
	
	
	
	
	
	

}
