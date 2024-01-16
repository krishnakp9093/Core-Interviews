package com.collection2;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		List l = new ArrayList();

		l.add(101);
		l.add(1, "Pawan");
	
		// System.out.println(l.listIterator(1));
		System.out.println(l);
		l.set(1, "Patidar");
		System.out.println(l);
		System.out.println(l.get(1));
		
		List l2= new ArrayList();
         l2.add("Ansh");
         l2.add("Saxena");
         System.out.println("Array-----------");
         
         Object[] o=l2.toArray(); 
         for(Object ele:o){
        	 System.out.println(ele);
         }
    
	}
}
