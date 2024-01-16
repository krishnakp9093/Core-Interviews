package com.collection.book;


import java.util.ArrayDeque;
import java.util.Deque;

public class BookDeque {
	public static void main(String[] args) {
		Deque d = new ArrayDeque();
		d.add("one");
		d.add("two");
		d.add("three");
		d.addFirst("zero");
		d.addLast("prarambh");
		System.out.println("d : "+d);
		
		Object o = d.element();
		System.out.println("o : "+o);
	
		//remove top element
		Object o1 = d.remove();
		System.out.println("d.remove() : "+o1);
		System.out.println(d);
		
		//remove top element
		Object o2 = d.removeFirst();
		System.out.println("d.removeFirst() : "+o2);
		System.out.println(d);
		
		//remove bottom element
		Object o3 = d.removeLast();
		System.out.println("d.removeLast() : "+o3);
		System.out.println(d);
	
	}

}
