package com.java.string;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String str = "Manjunatha";	
		String panlindromString = "madam";
		System.out.println("Reversed Sting :" +reverseString(str));
		
		//check is the string is palindrome or not
		
		System.out.println("Is it Palindrome ? :" + panlindromString.equals(reverseString(panlindromString)));
		
	}
	
	public static String reverseString(String str)
	{
		String revString = "";
		for(int i = str.length()-1; i>=0; i--)
		{
			
			revString = revString + str.charAt(i);
		}
			
		return revString;
	}

}