package com.collection1;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
	public static void main(String[] args) {

		ArrayList a = new ArrayList();

		a.add(1);
		a.add(2);
		a.add(3);

		Iterator it;

		it = a.iterator();

		while (it.hasNext()) {
			Object o = (Object) it.next();
			System.out.print(o);

			
		}
		
		System.out.println();
		/*
		 * while(it.hasNext()) { Integer i = (Integer)it.next(); System.out.println(i);
		 * 
		 * }
		 */

		// once iteration method start we can not make changes
		ArrayList a1 = new ArrayList();

		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);

		Iterator it1;
		it1 = a1.iterator();

		a1.add(5); // once Iteration starts no other element can be added.
		while (it1.hasNext()) {
			Object o1 = (Object) it1.next();
			System.out.print(o1);

		}
	}
}
