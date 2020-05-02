package com.hdfc.loans.personalloans;

import com.hdfc.loans.homeloans.A;
import com.hdfc.loans.homeloans.B;

public class C extends B
{

	public void m1()
	{
		System.out.println("I am overeridden M1 method from Class C");
	}
	
	public void m3()
	{
		System.out.println("I am M3 method from Class C");
	}
	
	public static void main(String[] args) 
	{
		
		A obj1 = new A();
		obj1.m1();
		
		B obj2 = new B();
		obj2.m2();
		obj2.m1();
		
		C obj3 = new C();
		obj3.m3();
		obj3.m2();
		obj3.m1();
		System.out.println(obj3.x);

	}

}
