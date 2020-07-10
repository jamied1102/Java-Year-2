package com.lab8;

import java.util.ArrayList;

public class Control2 
{
	public static void main(String[] args)
	{
		String firstName;
		String surName;
		String age;
		int i;
		
		GUI g1 = new GUI("list");
		ArrayList<Person2>plist = new ArrayList<Person2>();
		
			firstName = g1.getFirstName(); 
			surName = g1.getSurName();
			age = g1.getAge();
			Person2 p2 = new Person2(firstName, surName, age);
			plist.add(p2);
			System.out.println(plist.size());
			
		
		
		
		
	}
	
}
