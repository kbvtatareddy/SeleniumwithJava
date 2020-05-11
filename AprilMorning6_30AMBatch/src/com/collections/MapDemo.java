package com.collections;

import java.util.HashMap;

public class MapDemo 
{

	public static void main(String[] args) 
	{
		
		HashMap<Integer,Integer> HM = new HashMap<Integer,Integer>();
		
		HM.put(1, 100);
		HM.put(2, 100);
		HM.put(3, 100);
		HM.put(4, 400);
		HM.put(5, 500);
		
		System.out.println(HM);
		
		System.out.println(HM.get(3));
		System.out.println(HM.size());
		HM.remove(5);
		System.out.println(HM);
		
		
		
		
	}

}
