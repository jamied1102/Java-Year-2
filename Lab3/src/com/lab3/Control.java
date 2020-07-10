package com.lab3;

public class Control {

	public static void main(String[] args) 
	{
		Employee Employee1 = new Employee("John", "bob", 123, 1);
//		System.out.println(e1.getFirstName());
//		System.out.println(e1.getSurName());
//		System.out.println(e1.getStaffNumber());
//		System.out.println(e1.getAnnualSalary());
		System.out.println(Employee1);
		System.out.println("pay is " + Employee1.calculatePay(Employee1.getAnnualSalary()));

		HourlyEmployee Employee2 = new HourlyEmployee("bill", "ted", 321, 2.1, 1 , 2);
		System.out.println(Employee2);
		System.out.println("pay by hour is "+ Employee2.calculatePay(Employee2.getAnnualSalary()));
		
		CommissionEmployee Employee3 = new CommissionEmployee("jill", "mik", 567, 1, 5);
		System.out.println(Employee3);
		System.out.println("pay with commission is "+ Employee3.calculatePay(Employee3.getAnnualSalary()));
		
		Employee[] myEmployees= new Employee[3];
		myEmployees[0] = new Employee("John", "bob", 123, 1);
		myEmployees[1] = new HourlyEmployee("John", "bob", 123, 1, 1, 2);
		myEmployees[2] = new CommissionEmployee("jill", "mik", 567, 1, 5);
		
		for(int i = 0 ; i < 3; i++)
		{
			System.out.println(myEmployees[i]);
			System.out.println("pay is " + myEmployees[i].calculatePay(myEmployees[i].getAnnualSalary()));
		}
		
	}

}
