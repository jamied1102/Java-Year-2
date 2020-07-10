package com.lab7;

public class Employee extends Person 
{

	//attributes
	private Job job;
	private int personnelNumber;
	private Date startDate;
	private int nextNumber;
	
	//constructor
	Employee(String firstName, String surName, Date dateOfBirth, String gender, Job job, int personnelNumber, Date startDate, int nextNumber)
	{	
		super(firstName, surName, dateOfBirth, gender);
		this.job = job;
		this.personnelNumber = personnelNumber;
	}
	
	//getters + setters 
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public int getPersonnelNumber() {
		return personnelNumber;
	}
	public void setPersonnelNumber(int personnelNumber) {
		this.personnelNumber = personnelNumber;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public int getNextNumber() {
		return nextNumber;
	}
	public void setNextNumber(int nextNumber) {
		this.nextNumber = nextNumber;
	}
	
	public String toString()
	{
		return super.toString() + "employee info " + job  + personnelNumber  + startDate + nextNumber ;  
	}
}
