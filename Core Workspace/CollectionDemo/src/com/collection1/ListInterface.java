package com.collection1;

import java.util.*;

public class ListInterface {
	public static void main(String[] args) {

		// classes of List interface
		List l = new ArrayList();
		// List l1 = new LinkedList();
		// List l2 = new Vector();

		// methods of ArrayList class
		l.add(12);
		l.add(2.36);
		l.add('N');
		l.add("RATHORE");
		l.add(25);
		l.add("AMIT");
		l.add(2, "Neeraj");// it will add element
		System.out.println(l);// [12, 2.36, Neeraj, N, RATHORE, 25, AMIT]

		l.get(2); // it will return element of index 2
		System.out.println(l.get(2));// Neeraj

		l.set(2, "Neeraj"); // it will set Neeraj at index 2
		System.out.println(l);// [12, 2.36, Neeraj, N, RATHORE, 25, AMIT]

		l.remove(0); // it will remove element of index 0
		System.out.println(l);// [2.36, Neeraj, N, RATHORE, 25, AMIT]

		l.remove("Neeraj"); // int will remove Neeraj from the list
		System.out.println(l);// [2.36, N, RATHORE, 25, AMIT]

		int a = l.indexOf("RATHORE"); // it will return index of RATHORE
		System.out.println(a);// 2

		int a1 = l.lastIndexOf("RATHORE"); // it will return last index of RATHORE
		System.out.println(a1);// 2

		l.subList(0, 3); // it will return sublist
		System.out.println(l);// [2.36, N, RATHORE, 25, AMIT]

		l.add(null);
		System.out.println(l);// [2.36, N, RATHORE, 25, AMIT, null]

		l.add(null);
		System.out.println(l);// [2.36, N, RATHORE, 25, AMIT, null, null]

	}
}
