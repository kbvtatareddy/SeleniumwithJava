package com.hdfc.loans.homeloans;

public class ArrayDemo1 
{

	public static void main(String[] args) 
	{

		int a[] = {10, 20, 30};
		int b[] = {40, 50, 60};
		int c[] = {70, 80, 90};
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);

		for(int i = 0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i = 0;i<a.length;i++)
		{
			System.out.println(b[i]);
		}
		
		for(int i = 0;i<a.length;i++)
		{
			System.out.println(c[i]);
		}
	}

}
