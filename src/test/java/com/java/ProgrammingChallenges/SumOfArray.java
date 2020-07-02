package com.java.ProgrammingChallenges;

public class SumOfArray {
	
	static int arr[] = {12,34,65,765,23,678};
	
	static int sum()
	{
		int sum = 0;
		int i = 0;
		for(i = 1; i < arr.length; i++)
		{
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		
		System.out.println("Sum of given array :" + sum());
		

	}

}
