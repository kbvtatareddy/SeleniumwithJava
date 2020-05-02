package com.hdfc.loans.eduloans;

public class Hdfc implements Rbi
{

	public static void main(String[] args) 
	{
		
		Hdfc obj = new Hdfc();
		obj.withdrawal();
		obj.deposit();
	}

	@Override
	public void withdrawal() 
	{
		// TODO Auto-generated method stub
		System.out.println("I am overridden withdrawal from HDFC");
		System.out.println(x);
	}

	@Override
	public void deposit() 
	{
		// TODO Auto-generated method stub
		System.out.println("I am overridden deposit from HDFC");
		System.out.println(x);
	}

}
