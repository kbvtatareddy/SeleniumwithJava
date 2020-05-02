package com.hdfc.loans.homeloans;

public class TwoDimArray 
{

	public static void main(String[] args) 
	{
		int[] a1 = new int[4]; //single dimensional Array - declaring the size
		
		a1[0] = 10;
		a1[1] = 20;
		a1[2] = 30;
		a1[3] = 40;
		
		int[][] a = new int[3][3]; //Two dimensional Array - declaring the size
		
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;
		a[2][0] = 70;
		a[2][1] = 80;
		a[2][2] = 90;
		
		for(int i = 0;i<3;i++)
		{
			
			for(int j = 0;j<3;j++)
			{
				
				System.out.print(a[i][j] + "\t");
				
			}
			
			System.out.println();
		}
		
	}

}
