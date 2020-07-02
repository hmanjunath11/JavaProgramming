package com.java.string;

public class StringToInteger {

	public static void main(String[] args) {
		
		String strToInt = "1234";
		System.out.println(Integer.parseInt(strToInt));
		System.out.println(Integer.valueOf(strToInt));
		
		int i = 9876;
		
		System.out.println(Integer.toString(i));
		System.out.println(String.valueOf(i));
		
		String strTofloat = "23.45";
		System.out.println(Float.valueOf(strTofloat));
		
		float f = 23.6f;
		System.out.println(String.valueOf(f));
		
		

	}

}
