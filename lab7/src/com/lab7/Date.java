package com.lab7;

public class Date {
	
	//attributes
	private int day;
	private int month;
	private int year;
	
	//Constructors
		Date(int day, int month, int year)
		{
			if(day > 31)
			{
				System.out.println("day not allowed");
			}
			else
			{
				this.day = day;
			}
			if(month > 12)
			{
				System.out.println("month not allowed");
			}
			else
			{
				this.month = month;
			}
			
			this.year = year;
			
		//	System.out.println();
		}
	
	
	
	//getters + setters
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString()
	{
		return "the date is " + day  + month +  year;  
	}

}
