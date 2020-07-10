/*
 * Q1a) Implementation of a push button
 * Q1b) 5 constructors
 * Q2a) Contains various arrays 
 * Q2b) 1: asLiat
 * 		2:binarySearch
 * 		3:compare 
 * Name: Jamie Toft Delaney
 * StudentNo: d18124705
 * Date: 31/1/19
 */
package com.test.lab2;

public class Control {

	public static void main(String[] args) 
	{
		Animal a1 = new Animal("leo");
		Animal a2 = new Animal("spot", "dog", 2, true, "brown");
		Animal a3 = new Animal("bill", "cat", 4, false, "blue");
		Animal a4 = new Animal("bob", "cow", 3, true, "black");

		System.out.println(a2);
		System.out.println(a1);
	//	System.out.println(a1.name);
	//	System.out.println(a2.name);
	//	System.out.println(a2.breed);
	//	System.out.println(a2.age);
	//	System.out.println(a2.domesticAimal);
	//	System.out.println(a2.colour);
		a1.setName("jack");
		System.out.println(a1.getName());
		a1.setAge(11);
		System.out.println(a1.getAge());
		a1.setBreed("dog");
		System.out.println(a1.getBreed());
		a1.setColour("green");
		System.out.println(a1.getColour());
		a1.setDomesticAnimal(true);
		System.out.println(a1.isDomesticAnimal());
		System.out.println(a2.makeNoise());
		System.out.println(a3.makeNoise());
		a3.makeNoise(false);



	}

}
