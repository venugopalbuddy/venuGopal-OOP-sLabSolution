package com.greatlearning.firstlab;

public class Employee {
	
	private String firstName;
	private String lastName;
	
	public Employee(String fn,String ln) {
		
		firstName=fn;
		lastName=ln;	
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
