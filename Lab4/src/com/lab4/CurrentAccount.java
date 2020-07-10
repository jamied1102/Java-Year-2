package com.lab4;

public class CurrentAccount extends Account implements ValidatedAccount
{
	private double penaltyAmount;
	
	//constructor 
	CurrentAccount(String accountName, int accountNumber, String sortCode, String branchName, boolean inCredit, double accBalance, double penaltyAmount)
	{
		super(accountName, accountNumber, sortCode, branchName, inCredit, accBalance);
		this.penaltyAmount = penaltyAmount;
		
	}
	//getters/setters
	public double getPenaltyAmount() {
		return penaltyAmount;
	}

	public void setPenaltyAmount(double penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}
	
	//methods
	public double withdraw(double takeAmount)
	{
		super.withdraw(takeAmount);
		
		return getAcctBalance();
	}
	public void checkCredit()
	{
		if(this.getAcctBalance() < 100 && this.getAcctBalance() > 0)
		{
			this.setInCredit(true);
			
		}
		else
		{
			this.setInCredit(false);
		}
		if(isInCredit() == false)
		{
			System.out.println("insufficent funds");
		}
		else
		{
			System.out.println("sufficent funds");
		}
	}
	public void checkCredit(String warningMsg)
	{
		
		System.out.println(warningMsg);
	}
	

}
