package com.lab4;

public class Control 
{

	public static void main(String[] args) 
	{
		Account a1 = new Account ("jamie", 1, "a1", "dublin", true, 120);
		DepositAccount da1 = new DepositAccount ("jack", 2, "a2", "dublin", false, 20, .2);
		CurrentAccount ca1 = new CurrentAccount ("jamie", 1, "a1", "dublin", true, 120, 20);
		
		
		a1.deposit(100);
		a1.withdraw(20);
		da1.deposit(200);
		ca1.withdraw(200);
		ca1.checkCredit();
		System.out.println(a1.getAcctBalance());
		System.out.println(da1.getAcctBalance());
		System.out.println(ca1.getAcctBalance());
		


	}

}
