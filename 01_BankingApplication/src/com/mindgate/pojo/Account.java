package com.mindgate.pojo;

public abstract  class Account 
{
	//instance variable (global variable)
	private int accountNumber;
	private String name;
	private double balance;
	
	
	
	//constructors
	public Account() 
	{
		// TODO Auto-generated constructor stub
	}

	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
	
	
	
	public boolean withdraw (double amount)
	{
		if (amount >0) 
		{
			if (balance >= amount) 
			{
				balance = balance - amount;	
				return true;
			}
		}
		return false;
	}
	
	public boolean deposite (double amount)
	{
		if (amount > 0)
		{
			balance = balance + amount;
			return true;
		}
		return false;
	}
	

	
	
	
	
	//getter setter
	public int getAccountNumber()
	{
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	
	

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	

	public double getBalance() 
	{
		return balance;
	}

	public void setBalance(double balance) 
	{
		this.balance = balance;
	}

	
	
	
	// override toString to print everthing at once rather than printing again and again.
	@Override
	public String toString() 
	{
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
	
	
}
