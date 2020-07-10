package com.lab10;

public class Control {

	public static void main(String[] args) {
		
		TestHashSet s1 = new TestHashSet();
		s1.addhashshet("vatican city");
//		s1.printhashset();
		System.out.println(s1.checkhashset("Spain"));
//		s1.clearset();
//		s1.printhashset();
		s1.sortset();
//		s1.shuffleset();
		s1.rverseset();
	}

}
