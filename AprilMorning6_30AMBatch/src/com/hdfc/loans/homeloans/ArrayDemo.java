package com.hdfc.loans.homeloans;

import java.util.Scanner;

public class ArrayDemo 
{

	public void ArrayDemo()
	{
		int a = 100;
		int b = 100;
	if (a  > b)
	{
		System.out.println("a is greater than b");
	}
	
	else if (b > a)
	{
		System.out.println("b is greater than a");
	}
	
	else
	{
		System.out.println("a is equal to b");
	}
	}
	
	public void ArrayDemo1()
	{
		int a[] = {10,20,30,40};
		int i, k, l;
		
		System.out.print(a[0]);
		System.out.print(" " + a[1]);
		System.out.print(" " + a[2]);
		System.out.println(" " + a[3]);
		
		for(i=0;i<a.length;i++)
		{
			System.out.println("a[" + i + "]" + " : " + a[i]);
			
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int asize = sc.nextInt();
		
		int j [] = new int[asize];
		
		System.out.println("Enter the Data into the Array");
		
		for(l=0;l<j.length;l++)
		{
			j[l]=sc.nextInt();
			
		}
		
		//j[0]=100;
		//j[1]=200;
		//j[2]=300;
		//j[3]=400;
		
		for(k=0;k<asize;k++)
		{
			System.out.println("j[" + k + "]" + " : " + j[k]);
			
		}
		
		
	}
	
	
	public static void main(String[] args) 
	{
		
		
		
		ArrayDemo ad = new ArrayDemo();
		ad.ArrayDemo();
		ad.ArrayDemo1();
	}

}
