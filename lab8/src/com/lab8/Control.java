package com.lab8;

import java.util.ArrayList;

public class Control {

	public static void main(String[] args) 
	{
		int i;
		Person t;
		Person p1 = new Person("john", "bob", "dublin");
		Person p2 = new Person("bob", "john", "dublin");
		Person p3 = new Person("mick", "bill", "kildare");
		System.out.println(p1);
		ArrayList<Person>plist = new ArrayList<Person>();
		ArrayList<Person>plist2 = plist;
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		for(i = 0 ; i <3 ; i++)
		{
			t = plist.get(i);
			System.out.println(t);
			
		}
		
	
	}

}
