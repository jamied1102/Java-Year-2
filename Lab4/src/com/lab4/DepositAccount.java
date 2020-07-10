package com.lab4;

public class DepositAccount extends Account implements ValidatedAccount
{
	private double intrestRate;
	
 	//constructor 	
	DepositAccount(String accountName, int accountNumber, String sortCode, String branchName, boolean inCredit, double accBalance, double intrestRate)
	{
		super(accountName, accountNumber, sortCode, branchName, inCredit, accBalance);
		this.intrestRate = intrestRate;
	//getters/setters	
	}

	public double getIntrestRate() {
		return intrestRate;
	}

	public void setIntrestRate(double intrestRate) {
		this.intrestRate = intrestRate;
	}
	
	//methods
	public String withdraw()
	{
		return "you can not withdraw from this account";
	}	
}
