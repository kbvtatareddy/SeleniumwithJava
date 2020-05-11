package com.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapDemo2 
{

	public static void main(String[] args) 
	{
		
		LinkedHashMap<Integer,Integer> HM = new LinkedHashMap<Integer,Integer>();
		
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
