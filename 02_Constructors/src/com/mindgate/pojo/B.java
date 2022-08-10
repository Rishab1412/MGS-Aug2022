package com.mindgate.pojo;

public class B extends A
{
	public B()
	{
		System.out.println(" default constructor of B");
	}
	
	public B(int x)
	{
		super(x);
		System.out.println(" overloaded Constructor of B ");
	}
}
