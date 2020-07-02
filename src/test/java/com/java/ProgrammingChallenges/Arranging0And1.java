package com.java.ProgrammingChallenges;

public class Arranging0And1 {

	public static void main(String[] args) {
	
		int arr[] = {0,0,1,1,1,0,1,0,0};
		int counter = 0;
		for (int i = 0 ; i < arr.length; i++)
		{
			if(arr[i]==0)
			{
				counter++;
			}
		}
		System.out.println(counter);
		for(int j = 0; j < arr.length; j++)
		{
			if(j < counter)
			{
				arr[j] = 0;
			}
			else
			{
				arr[j] = 1;
			}
			System.out.print(arr[j]);
		}
	}

}
