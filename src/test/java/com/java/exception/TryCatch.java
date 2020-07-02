package com.java.exception;

public class TryCatch {
	
	public static void main(String[] arg)
	{
		  try
		  {
			  int data=50/0;//may throw exception    
		  }
		 catch(ArithmeticException  e){
			 System.out.println(e);  
		 }
		  int i = 50/25;
	      System.out.println("After Try and Catch block : " + i);
	}
}

