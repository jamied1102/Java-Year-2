package com.lab8;



public class Person 
{
	private String firstName;
	private String lastName;
	private String city;
	
	Person(String firstName, String lastName, String city)
	{	
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
	}

	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}
	public String toString()
	{
		return  "person info " + " "+this.firstName  +" "+ this.lastName  + " "+this.city;  
	}
}
