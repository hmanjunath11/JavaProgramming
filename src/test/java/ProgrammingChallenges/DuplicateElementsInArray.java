package com.java.ProgrammingChallenges;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
		
		for(int i = 0; i < strArray.length; i++)
		{
			System.out.println("Printing i :"+ i);
			for (int j = i + 1; j< strArray.length; j ++)
			{	
				System.out.println("Printing j :"+ j);
				if(strArray[i].equals(strArray[j]))
				{					
					System.out.println("Duplicate Element :" +strArray[j]);
				}
			}
		}
		
		//Java Program To Find Duplicate Elements In An Array Using HashSet
		
		HashSet<String> set = new HashSet<String>();
		for(String arrayElement : strArray)
		{
			if(!set.add(arrayElement))
			{
				System.out.println("Duplicate Element is : "+arrayElement);
			}
		}

	}

}
