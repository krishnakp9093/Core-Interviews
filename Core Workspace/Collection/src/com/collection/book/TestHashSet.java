package com.collection.book;

import java.util.HashSet;

public class TestHashSet {
	public static void main(String[] args) {
		HashSet s = new HashSet();
		s.add(11);
		s.add(10);
		s.add(12);
		s.add("shyam");
		s.add("verma");
		s.add("krishna");
		System.out.println(s);
		
		System.out.println(s.contains(12));
		System.out.println(s.isEmpty());
		System.out.println(s.remove("verma"));
		System.out.println(s.size());
		s.clear();
		System.out.println(s);
	}

}
