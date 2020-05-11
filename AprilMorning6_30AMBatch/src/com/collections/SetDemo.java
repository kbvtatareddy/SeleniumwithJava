package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(10);
		System.out.println(h);
		
		h.remove(30);
		System.out.println(h);
		
		LinkedHashSet<Integer> h1 = new LinkedHashSet<Integer>();
		h1.add(10);
		h1.add(20);
		h1.add(30);
		h1.add(10);
		h1.add(40);
		System.out.println(h1);
		
		System.out.println(h.size());
		System.out.println(h.hashCode());
		System.out.println(h.isEmpty());
		System.out.println(h.contains(30));
		
		h1.add(50);
		
		for(Integer i : h1)
			System.out.println(i);
		
		h.clear();
		System.out.println(h);
		
	}

}
