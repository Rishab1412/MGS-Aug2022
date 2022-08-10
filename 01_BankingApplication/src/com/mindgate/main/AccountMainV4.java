package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.Savings;

public class AccountMainV4 
{
	
	
	public static void main(String[] args) 
	{
		int accountNumber;
		String name;
		double balance;
		double amount;
		int press;
		String Choice;
		boolean result;
		boolean isSalary;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" enter details");
		
		System.out.println(" enter account number");
		accountNumber = scanner.nextInt();
		scanner.nextLine(); //used to store the enter key
		
		System.out.println(" enter name ");
		name = scanner.nextLine();
		
		
		System.out.println("enter balance");
		balance =  scanner.nextDouble();
		
		System.out.println("Do you want to open a salary account? (true or false) ");
		isSalary = scanner.nextBoolean();
		
		
		 Savings account = new Savings(accountNumber, name, balance,isSalary);
		
		 
		 System.out.println(account);
		 
		 System.out.println("---------");
		 
		 do
		 {
		 System.out.println(" press 1 to withdraw");
		 System.out.println(" press 2 to deposite");
		 System.out.println(" press 3 to check balance");
		 
		 press = scanner.nextInt();
		 
		 switch (press) 
		 {
		case 1: 
				System.out.println("Enter the amount to withdraw");
				amount = scanner.nextInt();
				result= account.withdraw(amount);
		if(result)
		{
			System.out.println(" transcation sucessfull");
			System.out.println("balance ::" + account.getBalance());
		}
		else
		{
			System.out.println(" transcation declined");
		}
		
		break;
		
		case 2:
			System.out.println("Enter the amount to deposite");
			amount = scanner.nextInt();
			result= account.deposite(amount);
	if(result)
	{
		System.out.println(" transcation sucessfull");
		System.out.println("balance ::" + account.getBalance());
	}
		
		break;
		
		case 3: System.out.println("your balance"+ account.getBalance());
		break;
		
		default: System.out.println(" please enter valid input");
		break;
		 }
		 System.out.println(" do you want to continue?");
		Choice = scanner.next();
		
		
		
		}while (Choice.equals("yes"));
		 
		 
		 
	}
	
}

