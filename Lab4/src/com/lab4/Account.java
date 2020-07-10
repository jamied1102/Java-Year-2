package com.lab4;

public class Account implements ValidatedAccount
{
	private String accountName;
	private int accountNumber;
	private String sortCode;
	private String branchName;
	private boolean inCredit;
	private double acctBalance;
	
	//constructor 
	Account(String accountName, int accountNumber, String sortCode, String branchName, boolean inCredit, double accBalance)
	{
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.sortCode = sortCode;
		this.branchName = branchName;
		this.inCredit = inCredit;
		this.setAcctBalance(acctBalance);
	}
	//setters/getters
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getSortCode() {
		return sortCode;
	}

	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public boolean isInCredit() {
		return inCredit;
	}

	public void setInCredit(boolean inCredit) {
		this.inCredit = inCredit;
	}

	public double getAcctBalance() {
		return acctBalance;
	}

	public void setAcctBalance(double acctBalance) {
		this.acctBalance = acctBalance;
	}
	
	//Methods
	public double deposit(double depAmount)
	{
		this.acctBalance = acctBalance + depAmount;
		
		return acctBalance;
	}
	public double withdraw(double takeAmount)
	{
		this.acctBalance = acctBalance - takeAmount;
		
		
		return acctBalance;
	}	
	
}
