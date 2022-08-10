package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.factory.AccountFactory;
import com.mindgate.pojo.Account;
import com.mindgate.pojo.Current;
import com.mindgate.pojo.Savings;

public class AccountMainV7 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int choice;
		System.out.println("Press 1. Savings");
		System.out.println("Press 2. Current");
		
		System.out.println("Enter Choice");
		choice = scanner.nextInt();
		
		AccountFactory accountFactory  = new AccountFactory();
		Account account = accountFactory.getAccount(choice);
		System.out.println("Account object created");
		
		if(account instanceof Savings)
		{
			System.out.println("Saving account is created");
		}
		
		
		if(account instanceof Current)
		{
			System.out.println("Current object is created");
		}
	}
}
