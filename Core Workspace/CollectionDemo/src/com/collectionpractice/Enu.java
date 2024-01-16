package com.collectionpractice;

import java.util.Enumeration;
import java.util.Vector;

public class Enu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		v.add(121);
		v.add(1233);
		v.add(43567);
		v.add(2334);
		
		Enumeration en = v.elements();
		
		v.add(12233);
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
