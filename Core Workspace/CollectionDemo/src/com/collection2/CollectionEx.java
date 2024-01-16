package com.collection2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionEx {

	public static void main(String[] args) {
		
		Collection c= new ArrayList();
		
		c.add(101);
		c.add("Pushpendra");
		c.add("Raju");
		c.add("Jay");
		
		Collection c1=new ArrayList();
		
		c1.addAll(c);
		c1.add(102);
		c1.add("SINGH");
		
		Iterator it=c1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(c.contains(101));
		//c.clear();
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c.isEmpty());
				
	}
}
