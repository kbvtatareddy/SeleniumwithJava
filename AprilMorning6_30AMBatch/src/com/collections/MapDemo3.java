package com.collections;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo3 
{

	public static void main(String[] args) 
	{
		
		TreeMap<Integer,Integer> HM = new TreeMap<Integer,Integer>();
		
		HM.put(1, 600);
		HM.put(2, 100);
		HM.put(6, 100);
		HM.put(4, 400);
		HM.put(5, 500);
		
		System.out.println(HM);
		
		System.out.println(HM.get(3));
		System.out.println(HM.size());

	}

}
