package com.lab3;

public class HourlyEmployee extends Employee 
{
	double hourlyRate;
	double hoursWorked;
	
	//constructor
	HourlyEmployee(String firstName, String surName, int staffNumber, double annualSalary, double hourlyRate, double hoursWorked)
	{
		super(firstName, surName, staffNumber, annualSalary);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	
	
	public double calculatePay(double pay)
	{
		pay = this.hourlyRate * this.hoursWorked;
		return pay;
	}

	public String toString() {
		return super.toString() + " hourly rate is " + this.hourlyRate + " hours worked is " + this.hoursWorked;
	}
		
	
	
	
}
