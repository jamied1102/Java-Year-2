package com.lab3;

public class Employee 
{
	private String firstName;
	private String surName;
	private int staffNumber;
	private double annualSalary;
	
	//Constructors
	Employee(String firstName, String surName, int staffNumber, double annualSalary)
	{
		this.firstName = firstName;
		this.surName = surName;
		this.staffNumber = staffNumber;
		this.annualSalary = annualSalary;
	//	System.out.println();
	}
	
	
	
	
	//getters and setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public int getStaffNumber() {
		return staffNumber;
	}
	public void setStaffNumber(int staffNumber) {
		this.staffNumber = staffNumber;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	//Methoods
	public double calculatePay(double monthlyPay)
	{
		monthlyPay = this.annualSalary / 12;
		
		return monthlyPay;
		
	}
	
	public String toString()
	{
		return "this Employee is called " + firstName +" " + surName + " and has a salary of " + annualSalary + " his employee number is " + this.staffNumber;  
	}
	
	
	
}
