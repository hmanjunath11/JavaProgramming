package com.java.ProgrammingChallenges;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 12345;
		int  rem, rev= 0;
		
		while (num !=0)
		{
			rem = num%10; // gives the reminder values each time number is divided
			rev = rev * 10 + rem;
			num = num/10;
		}

		System.out.println(rev);
	}

}
