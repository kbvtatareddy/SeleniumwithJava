package com.hdfc.loans.homeloans;

public class Employee 
{

	int eno;
	String ename;
	float sal;
	
	//public Employee()
	//{
	//	System.out.println("I am from default Constructor");
	//	System.out.println(this.eno);
	//	System.out.println(this.ename);
	//	System.out.println(this.sal);
	//}
	
	public Employee(int eno)
	{
		//this();
		this.eno=eno;
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}
	
	
	public Employee(int eno, String ename)
	{
		this(111);
		this.eno=eno;
		this.ename=ename;
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
		
	}
	
	public Employee(int eno, String ename, float sal)
	{
		this(112, "ABCD");
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
		
		
	}
	
	public static void main(String[] args) 
	{
		
		//Employee e1 = new Employee();
		//System.out.println(e1.eno);
		//System.out.println(e1.ename);
		//System.out.println(e1.sal);
		
		
		//Employee e2 = new Employee(111);
		//System.out.println(e2.eno);
		//System.out.println(e2.ename);
		//System.out.println(e2.sal);
		
		
		//Employee e3 = new Employee(112, "ABCD");
		//System.out.println(e3.eno);
		//System.out.println(e3.ename);
		//System.out.println(e3.sal);
		
		Employee e4 = new Employee(112, "ABCD", 99999);
		
		
	}
}
