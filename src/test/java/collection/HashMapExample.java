package com.java.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "Mohan");
		hm.put(2, "Shastri");
		hm.put(2, "Sharan");
		hm.put(3, "Anish");
		hm.put(4, null);
		hm.put(5, null);
		hm.put(6, null);
		hm.put(null, null);
		System.out.println(hm);
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+ "   " + m.getValue());
		}

	}

}
