package com.hdfc.loans.homeloans;

import java.util.Date;

public class A 
{

	public int x = 100;
	
	public void m1()
	{
		System.out.println("I am M1 method from Class A");
	}
	
	public static void m4()
	{
		System.out.println("I am m4 method from Class A");
	}
	
	static
	{
		Date d = new Date();
		System.out.println(d);
	}
	
	static
	{
		System.out.println("I am from static block2");
	}
	public static void main(String[] args) 
	{
		A obj1 = new A();
		obj1.m1();
		System.out.println(obj1.x);
		A.m4();
	}

}
