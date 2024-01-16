package com.collection1;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

//Enumeration is work with historical classes only like vector and Hashtable
public class EnumerationExample {
public static void main(String[] args) {
	Vector v = new Vector();
	v.add(1);
	v.add(2);
	v.add(3);
	v.add(4);
	
	Enumeration e = v.elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	
	Hashtable h = new Hashtable();
	h.put(1,'a');
	h.put(2,'b');
	h.put(3,'c');
	h.put(4,'d');
	Enumeration e1 = v.elements();
	while(e1.hasMoreElements()) {
		System.out.println(e1.nextElement());
	}
	
	
	//Iteration method will also work same as Enumeration
	/*Iterator it ;
	it = v.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	*/
	}
	
	
}

