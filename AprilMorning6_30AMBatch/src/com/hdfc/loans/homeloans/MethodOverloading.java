package com.hdfc.loans.homeloans;

public class MethodOverloading 
{

	
	  public void m1(int i) { System.out.println(i); }
	 
	
	  public void m1(float i) { System.out.println(i); }
		 
	
	public void m1(String i)
	{
		System.out.println(i);
	}
	
	public static void main(String[] args) 
	{
		MethodOverloading m1 = new MethodOverloading();
		m1.m1(12.38f);
		m1.m1(100);
		m1.m1("Hi");

	}

}
