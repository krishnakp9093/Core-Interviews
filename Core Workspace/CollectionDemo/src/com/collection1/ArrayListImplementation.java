package com.collection1;

import java.util.ArrayList;

public class ArrayListImplementation {
public static void main(String[] args) {
	ArrayList a = new ArrayList();
	
	a.add(1);
	a.add(2);
	a.add(3);
	
	//we can also add element in this way
	Integer i = new Integer(4);
	a.add(i);
	System.out.println(a);

	
	System.out.println(a.get(0));
	System.out.println(a.get(1));
	System.out.println(a.get(2));//we can get element in this way
	
	Object o = a.get(3);//object form
	System.out.println(o);//we can also get element in this way
	
	System.out.println(2 + " : " +a.get(2) );
	Object o1 = a.get(2);
	System.out.println(2 + " : " +o1 );
	System.out.println(2 + " : " +o1.toString() );
	
	Integer i1 = (Integer)a.get(3);
	System.out.println(i1);//Integer form 
	
	
	}
}
 