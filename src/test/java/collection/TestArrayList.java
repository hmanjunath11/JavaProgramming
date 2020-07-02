package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestArrayList {
	
	public static void main(String arg[])

	{
		List<String> list = new ArrayList<String>();	
		List<String> list1 = new ArrayList<String>();	
		System.out.println("Initial size of the list = " +list.size());
		list.add("CCC");
		list.add("aaa");
		list.add("bbb");
		System.out.println("content befofre insertion =  " + list);
		list.set(0,"444");
		System.out.println("content after insertion =  " + list);
		list.set(0, "111");
		list.set(1, "444");
		list.add("555");
		list.add(1, "0000");
		System.out.println("content after insertion =  " + list);
		list.remove(1);
		System.out.println("content after insertion =  " + list);	
	
		System.out.println("Size after addition =  " + list.size());
		System.out.println("content of arraylist =  " + list);
		list.add(1, "ddd");
		System.out.println("content before list =  " + list);
		list1.add("111");
		list1.add("222");			
		list.addAll(2, list1);
		System.out.println("content after insertion =  " + list);		
		System.out.println(list.lastIndexOf("111"));	
		
		//Traversing list through Iterator 
		
		Iterator<String> itr = list.iterator();
		System.out.println("Thru Iterator :");
		while(itr.hasNext())
		{
			System.out.print("\t"+ itr.next());
		}
		
		//Traversing list through for-each loop 
		System.out.println("\n"+"Thru for loop :");
		for(String obj:list)
			System.out.print("\t" +obj);
		
		// Traversing thru reverse order		
		ListIterator<String> listItr = list.listIterator(list.size());	
		System.out.println("\n"+"Traversing thru reverse order :");
		while(listItr.hasPrevious())
		{	
			System.out.print("\t"+listItr.previous());
		}
		
		 
	}
}
