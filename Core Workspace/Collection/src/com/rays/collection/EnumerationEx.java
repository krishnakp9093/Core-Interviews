package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx {

	public static void main(String[] args) {

		Vector l = new Vector();
		l.add("ONE");
		l.add("TWO");
		l.add("THREE");
		l.add("FOUR");

		Enumeration en = l.elements();

		l.add("6");
		while (en.hasMoreElements()) {
			String str = (String) en.nextElement();

			System.out.println(str);

		}
	}

}
