package com.hdfc.loans.homeloans;

public class VariableTypes 
{

	int x = 100; // Primitive Variable - Instance Variable// non static // GLobal Variable
	static String cname = "FINASTRA"; // Primitive Variable - static variable
	static VariableTypes obj;
	
	public void m1()
	{
		int y = 10; // // Primitive Variable - local variable
		System.out.println(y);
		System.out.println(x);
		System.out.println(VariableTypes.cname);
	}
	
	public static void m2()
	{
		//VariableTypes obj6 = new VariableTypes();
		obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}
	public static void main(String[] args) 
	{
		
		//VariableTypes obj5 = new VariableTypes(); // any class object is called reference variable(obj5)
		obj = new VariableTypes();
		System.out.println(obj.x);		 
		System.out.println(VariableTypes.cname);
		obj.m1();
		m2();
		
	}

}
