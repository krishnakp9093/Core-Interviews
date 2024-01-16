package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();

		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);

		Iterator it1 = a1.iterator();

		while (it1.hasNext()) {
			
			/*
			 * used for get output as an object
			 * Object o1 = (Object) it1.next();
			 * System.out.print(o1);
			 */

			System.out.println(it1.next());
		
		}
		
	}

}
