package com.lab3;

public class CommissionEmployee extends Employee
{
	double commissionEarned;
	
	//constructor
	CommissionEmployee(String firstName, String surName, int staffNumber, double annualSalary, double commissionEarned)
	{
		super(firstName, surName, staffNumber, annualSalary);
		this.commissionEarned = commissionEarned;
		
	}
	
	//Methoods
	public double calculatePay(double monthlyPay)
	{
		monthlyPay = super.getAnnualSalary() / 12 + commissionEarned;		
		return monthlyPay;
			
	}
	
	public String toString() {
		return super.toString() + " commission earned is " + this.commissionEarned;
	}
}
