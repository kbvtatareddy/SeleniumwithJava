package com.hdfc.loans.homeloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		
		String s2 = new String("FINASTRA");
		System.out.println(s2);
		
		String s1 = "B V TATA REDDY KARRI";
		System.out.println(s1);
		System.out.println(s1.charAt(5));
		System.out.println(s1.indexOf("R"));
		System.out.println(s1.hashCode());
		System.out.println(s1.length());
		System.out.println(s1.startsWith("B"));
		System.out.println(s1.endsWith("Y"));
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains("TATA"));
		System.out.println(s1.contains(s2));
		
		System.out.println(s1);
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		
		String[] spl = s1.split(" ");
		System.out.println(s1);
		
		System.out.println(spl[0]);
		System.out.println(spl[1]);
		System.out.println(spl[2]);
		System.out.println(spl[3]);
		System.out.println(spl[4]);
		
		for(int i = 0;i<spl.length;i++)
		{
			System.out.println(spl[i]);
		}
		
		String sbs1 = "BANGALORE";
		System.out.println(sbs1.substring(2));
		System.out.println(sbs1.substring(2, 5));
		
		System.out.println(sbs1.replace("BANGALORE","RIYADH"));
		System.out.println(s1.replace("A", "Z"));
		System.out.println(s1);
	}

}
