package com.java.string;

public class StringFuncitons {
	
	
	// Using String built-in function
	public boolean isPalindrome(String str)
	{
		if(str == null)
			return false;	
	
	StringBuilder strBuilder = new StringBuilder(str);
	strBuilder.reverse();
	
	return strBuilder.toString().equals(str);
	}
	
	// Without Using String Functions
	
	public void isPalindromeWithoutStringFunctions(String str)
	{
				
		for(int i=0; i < str.length() ;i++)
		{
			
			System.out.println(str.charAt(i));
		}
		
		
	}
	
	
	
}
