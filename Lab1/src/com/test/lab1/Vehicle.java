package com.test.lab1;

public class Vehicle 
{
	private String ownerName;
	private	int maxSpeed;
	private	String colour;
	private	String regNumber;
	private	String type;
	private int noOfWheels;
	
	Vehicle(String name)
	{
		this.ownerName = name;
	}
	
	Vehicle(String name, int maxSpeed, String colour, String regNumber, String type, int noOfWheels)
	{
		this.ownerName = name;
		this.maxSpeed = maxSpeed;
		this.colour = colour;
		this.regNumber = regNumber;
		this.type = type;
		this.noOfWheels = noOfWheels;
		System.out.println(name);
		System.out.println(maxSpeed);
		System.out.println(colour);
		System.out.println(regNumber);
		System.out.println(type);
		System.out.println(noOfWheels);
	}
	public String toString()
	{
		return "This cars owner is " + ownerName +" max speed is " + maxSpeed + " the colour is " + colour+ " the reg number is " + regNumber + " The car is " + type +"\n"
				+  "number of wheels is " + noOfWheels;
	}
	
}
