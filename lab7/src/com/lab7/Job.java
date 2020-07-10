package com.lab7;

public class Job {
	
	//attributes
	private double salary;
	private String role;
	private int jobID;
	
	
	
	//Constructors
	Job(double salary, String role, int jobID)
	{
		this.salary = salary;
		this.role = role;	
		this.jobID = jobID;
				
	//	System.out.println();
	}
	
	//getters + setters
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getJobID() {
		return jobID;
	}
	public void setJobID(int jobID) {
		this.jobID = jobID;
	}
	
	public String toString()
	{
		return "employee info " + salary  + role  + jobID ;  
	}

}
