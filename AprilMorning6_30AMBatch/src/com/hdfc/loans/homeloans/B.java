package com.hdfc.loans.homeloans;

public class B extends A
{

	public void m1()
	{
		System.out.println("I am overriden M1 method from Class B");
	}
	
	
	
	public void m2()
	{
		System.out.println("I am M2 method from Class B");
	}
	
	public static void main(String[] args) 
	{
		
		A obj1 = new A();
		obj1.m1();
		System.out.println(obj1.x);
		
		
		B obj2 = new B();
		obj2.m2();
		obj2.m1();
		System.out.println(obj2.x);
	}

}

