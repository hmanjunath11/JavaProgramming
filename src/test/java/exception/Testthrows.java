package com.java.exception;

import java.io.IOException;

class Testthrows{  
	  void m() throws IOException{  
	    
	  }  
	  void n() throws IOException{  
	    m();  
	  }  
	  void p() throws IOException{  	  
	    n();  	   
	  }  
	  public static void main(String args[]) throws IOException{  
	   Testthrows obj=new Testthrows();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  }  
	}  


