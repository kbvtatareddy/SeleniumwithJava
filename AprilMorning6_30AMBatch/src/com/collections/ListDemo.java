package com.collections;

import java.util.ArrayList;

public class ListDemo 
{

	public static void main(String[] args) 
	{

		ArrayList<Object> a = new ArrayList<>();
		a.add(10);
		a.add("B V TATA REDDY KARRI");
		a.add(10);
		a.add(12.345f);
		
		System.out.println(a);
		
		for(Object j: a)
		{
			System.out.println(j);
		}
		
		System.out.println(a.get(1));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.indexOf("B V TATA REDDY KARRI"));
		System.out.println(a.hashCode());
		System.out.println(a.contains(20));
		System.out.println(a);
		a.add(1000);
		System.out.println(a);
		a.add(1, "BOSS");
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		
		//a.clear();
		//System.out.println(a);
		
		ArrayList<Object> b = new ArrayList<>();
		b.add(9);
		b.add(19);
		b.add("FINASTRA");
		a.addAll(b);
		System.out.println(a);
		

	}

}
