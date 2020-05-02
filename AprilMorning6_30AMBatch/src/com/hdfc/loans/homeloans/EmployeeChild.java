package com.hdfc.loans.homeloans;

public class EmployeeChild extends Employee
{

	String address;
	
	public EmployeeChild(String address)
	{
		super(111, "ZYXW", 15000);
		this.address=address;
		System.out.println(address);
	}
	
	public static void main(String[] args) 
	{

	EmployeeChild e1 = new EmployeeChild("Bangalore");
	

	}

}
