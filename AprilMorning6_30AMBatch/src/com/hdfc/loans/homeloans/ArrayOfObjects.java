package com.hdfc.loans.homeloans;

public class ArrayOfObjects 
{

	public static void main(String[] args) 
	{
		
		Employeee e1 = new Employeee(711328, "B V TATA REDDY KARRI");
		Employeee e2 = new Employeee(711329, "B V TATA REDDY KARRI");
		Employeee e3 = new Employeee(711330, "B V TATA REDDY KARRI");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		Employeee[] e = new Employeee[3];
		e[0]=e1;
		e[1]=e2;
		e[2]=e3;
		for(int i = 0;i<3;i++)
		{
			System.out.println(e[i]);
		}
		
		for(Employeee a: e)
		{
			System.out.println(a);
		}
	}

	}


class Employeee
{
	int eno;
	String ename;
	
	public Employeee(int eno, String ename)
	{
		
		this.eno=eno;
		this.ename=ename;
		
		//System.out.println(eno);
		//System.out.println(ename);
		
	}

	@Override
	public String toString() {
		return "Employeee [eno=" + eno + ", ename=" + ename + "]";
	}
	
}