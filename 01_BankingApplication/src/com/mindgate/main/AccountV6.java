package com.mindgate.main;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.Savings;

public class AccountV6 
{
	public static void main(String[] args) 
	{
		Account account;
		
		account = new Savings(101, "rishab", 3000, false);
		System.out.println(account.withdraw(2000));
		
	}
}
