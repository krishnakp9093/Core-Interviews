package com.collection.book;


import java.util.TreeMap;

public class BookTreeMap {
	public static void main(String[] args) {
		TreeMap t = new TreeMap();
		t.put(10, "Rohan");
		t.put(2, "Krishhna");
		t.put(3, "Raju");
		t.put(4, "Shiv");
	
		System.out.println(t);
		
		//print all key and value pairs
	for(Object o :t.keySet()) {
		System.out.println(o + " = "+t.get(o));
	}
		
	}

}
