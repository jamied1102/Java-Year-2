/*
 * Name: Jamie Toft Delaney
 * StudentNo: d18124705
 * Date: 31/1/19
 */
package com.test.lab2;

public class Animal 
{
	private String name;
	private String breed;
	private int age;
	private boolean domesticAnimal;
	private String colour;
	String noise;
	String volume;
	
	//constructors	
	Animal(String name)
	{
		this.name = name;
		System.out.println(name);

	}
	Animal(String name, String breed, int age, boolean domesticAimal, String colour)
	{
		this.name = name;
		this.setBreed(breed);
		this.setAge(age);
		this.setDomesticAnimal(domesticAnimal);
		this.setColour(colour);
	//	System.out.println(name);
	//	System.out.println(breed);
	//	System.out.println(age);
	//	System.out.println(domesticAnimal);
	//	System.out.println(colour);
	}
	public String toString()
	{
		return "This animal is called " + name +", is a dog that is " + getColour() + " in colour and has 4 legs and is " + isDomesticAnimal() + "\n";
				
	}
	//methoods
	public void setName(String name)
	{
		this.name = name; 
	}
	public String getName()
	{
		return "animal name is " + name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public boolean isDomesticAnimal() {
		return domesticAnimal;
	}
	public void setDomesticAnimal(boolean domesticAnimal) {
		this.domesticAnimal = domesticAnimal;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String makeNoise()
	{
		if(this.breed.equals("dog"))
		{
			noise = "woof";
		}
		else
		{
			noise = "not dog";
		}
	return noise;
		
	}
	public void makeNoise(boolean old)
	{
		if(old)
		{
			System.out.println("quiet animal");
		}
		else
		{
			makeNoise();
		}
		
	}
}

