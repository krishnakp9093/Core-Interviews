package com.rays.collection;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class FailFast {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();

		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);

		Iterator it1;
		it1 = a1.iterator();

		// once Iteration starts no other element can be added.
		//it provide ConcurrentModificationException() 
		
		a1.add(5);
		a1.add(6);
		
		while (it1.hasNext()) {
			Object o1 = (Object) it1.next();
			System.out.print(o1);

		}
	}
}
