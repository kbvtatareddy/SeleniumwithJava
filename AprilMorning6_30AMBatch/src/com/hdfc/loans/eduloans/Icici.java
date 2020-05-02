package com.hdfc.loans.eduloans;

public class Icici implements Rbi
{

	public static void main(String[] args) 
	{
		Icici obj = new Icici();
		obj.withdrawal();
		obj.deposit();
		
	}

	@Override
	public void withdrawal() 
	{
		System.out.println("I am ovveridden withdrawal from Icici");
		
	}

	@Override
	public void deposit() 
	{
		
		System.out.println("I am overridden deposit from Icici");
		
	}

}
