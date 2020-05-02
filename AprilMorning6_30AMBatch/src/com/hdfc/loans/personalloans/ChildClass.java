package com.hdfc.loans.personalloans;

public class ChildClass extends D
{

	
	
	
	public static void main(String[] args)

	{
		ChildClass obj4 = new ChildClass();
		obj4.a1();
		obj4.a2();

	}
	
	@Override
	public void a2() 
	{
		
		System.out.println("I am a2 overridden method in ChildClass");
		
	}

}
