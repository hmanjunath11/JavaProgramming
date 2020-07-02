package com.java.collection;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(9,"9");
		tm.put(2, null);
		tm.put(6, null);
		
		for(Map.Entry m:tm.entrySet())
		{
			System.out.println(m.getKey()+ "  " + m.getValue());
		}

	}

}
