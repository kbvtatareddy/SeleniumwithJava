package com.hdfc.loans.eduloans;

public class ThirdClass 
{

	int a=10,b=20,c;
	
	public void add()
	{
		c=a+b;
		System.out.println("Addition of a and b is:" + c);
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("Subtraction of a and b is:" + c);
	}
	
	
	public static void main(String[] args) 
	{
		
		ThirdClass obj = new ThirdClass();
		obj.add();
		obj.sub();
		
		ThirdClass obj1 = new ThirdClass();
		obj1.add();
		obj1.sub();

	}

}
