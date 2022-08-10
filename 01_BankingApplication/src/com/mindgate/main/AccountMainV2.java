package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountMainV2 
{
	public static void main(String[] args) 
	{
		System.out.println(" This is AccountMainV2 ");
		
		Account account = new Account(103, "Sanjay", 1000);
		
		System.out.println(account);
		
		System.out.println("Withdraw :: 500");
		
		//boolean result = account.withdraw(500);
		
		if(account.withdraw(500)) 
		{
			System.out.println("Transaction Successful");
		}
		else
		{
			System.out.println("Transaction declined");
		}
		System.out.println("balance ::" + account.getBalance() );
		
	}
}
