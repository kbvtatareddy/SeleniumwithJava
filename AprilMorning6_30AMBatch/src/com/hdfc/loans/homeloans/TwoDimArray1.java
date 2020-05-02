package com.hdfc.loans.homeloans;

public class TwoDimArray1 
{

	public static void main(String[] args) 
	{
		
		int x[] = {1, 2, 3};
		int y[] = {4, 5, 6};
		int z[] = {7, 8, 9};
		
		int a[][] = {
				      {10, 20, 30, 100},
				      {40, 50, 60},
				      {70, 80, 90, 100, 110, 120}
		            };
		
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		for(int p[]: a) 
		{
		
			for(int j = 0;j<p.length;j++)
			{
				
			System.out.print(p[j] + "\t");
			
		    }
			
			System.out.println();
		}

}
}