package com.collection2;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx {

	public static void main(String[] args) {
		SortedSet s= new TreeSet();
		s.add("One");
		s.add("Two");
		s.add("Three");
		s.add("Four");
		
		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.comparator());
		System.out.println(s.headSet("Two"));
		System.out.println(s.tailSet("One"));
		System.out.println(s.subSet("Four", "Three"));
		
	}
}
