package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args) 
	{
		
		ArrayList<String> a = new ArrayList<String>();
		
			a.add("ABCD");
			a.add("EFGH");
			a.add("IJKL");
			a.add("MNOP");
			
			System.out.println(a);
		
		
		ListIterator<String> var = a.listIterator();
		while(var.hasNext())
		{
			String val = var.next();
			if(val=="ABCD")
				var.set("WXYZ");
			else
				var.remove();
		}
		System.out.println(a);

	}

}
