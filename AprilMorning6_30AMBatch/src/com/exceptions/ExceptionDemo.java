package com.exceptions;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionDemo 
{

	public static void main(String[] args) 
	{
		
		
		ArithmeticException a = new ArithmeticException();
		
		int nr,dr,result;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		while (true) {
			try 
			{
				System.out.println("Enter the nr value");
				nr = sc.nextInt();
				
				System.out.println("Enter the dr value");
				dr = sc.nextInt();
				
				result = nr / dr;
				System.out.println(result);
				break;
			}

			catch (Exception e)
			{
				//e.printStackTrace();
				//System.out.println(e);
				System.out.println("Dr should be greater than zero..");
			}
			
			//catch (ArithmeticException e) 
			//{

			//	e.printStackTrace();
				
			//}
			//catch (NullPointerException e)
			//{
			//	e.printStackTrace();
			//}
			//catch (NoSuchElementException e)
			//{
			//	e.printStackTrace();
			//}
		}
	}

}
