package com.exceptions;

import java.util.Scanner;

public class UserDefeinedException extends Exception
{

	public static void main(String[] args) 
	{
		String num;
		
				
				
					while (true) 
					{
						
						Scanner sc = new Scanner(System.in);
						System.out.println("Enter Alphanumeric value");
						num = sc.nextLine();
						
						try 
						{
							if (num.length() != 10) 
							{

								throw new UserDefeinedException();

								//System.out.println("Enter less than 10 chars");
							}
							else
							{
								System.out.println(num);
								break;
							}
						} 
						
						catch (UserDefeinedException e) 
						{

							//e.printStackTrace();
							System.out.println("ENter the value equal to 10 chars");
							
						}
						finally
						{
							System.out.println("I am from Final Block");
						}
				
						
					}				

	}

}
