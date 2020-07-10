package com.lab7;

import java.io.File;
import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		
		//constructors
		Date date1 = new Date(12, 6, 2019);
		Job job1 = new Job(100, "nurse", 27);
		Person person1 = new Person("john", "whick", date1,"fish");
		Employee employee1 = new Employee("jack", "black", date1, null, job1, 0, date1, 0 );
		FileProcessor f1 = new FileProcessor(job1.getRole());
		
		f1.readfile();
	//	f1.fc(job1.getRole());
		System.out.println(date1);
		System.out.println(job1);
		System.out.println(person1);
		System.out.println(employee1);
	}

}
 