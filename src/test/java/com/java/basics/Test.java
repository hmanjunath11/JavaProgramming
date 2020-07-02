package com.java.basics;

public abstract class Test {
	
	
	
	
	public static void main(String[] args) {	
		
		StringBuffer str = null;
		
		int l1= 0,l2 = 0,l3 = 0;
		
		for(int i=1; i <=3; i++)
		{
			l1 = i + l2;
			l2 = l1;
			System.out.println(l1 +"\t"+ l2);
		}

	}

}
