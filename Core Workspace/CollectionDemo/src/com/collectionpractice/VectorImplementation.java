package com.collectionpractice;

import java.util.TreeSet;
import java.util.Vector;

public class VectorImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
	    
		v.add("raj");
		v.add("taj");
		v.add("rohan");
		v.add("rohit");
		
		System.out.println(v.capacity());//10
		System.out.println(v.firstElement());//raj
		System.out.println(v.subList(1, 3));//[taj, rohan]
		
	
		TreeSet t = new TreeSet();
		
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		
		
		System.out.println();
		
	}

}
