package com.lab8;



public class Person2
{
	private String firstName;
	private String lastName;
	private String age;
	
	Person2(String firstName, String lastName, String age)
	{	
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
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



	public String getAge() {
		return age;
	}



	
	public String toString()
	{
		return  "person info " + " "+this.firstName  +" "+ this.lastName  + " "+this.age;  
	}

	public void setAge(String age) {
		this.age = age;
	}
}
