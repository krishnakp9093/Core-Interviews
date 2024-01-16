package com.collection.book;

import java.util.ArrayList;
import java.util.Collections;

public class BookComparableTestMarksheet {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();

		a.add(new BookComparableMarksheet("A5", "Krishhna", 89));

		a.add(new BookComparableMarksheet("A1", "Raj", 70));

		a.add(new BookComparableMarksheet("A9", "Rohit", 88));

		// Sort elements by Comparable
		Collections.sort(a);
		// print all elements
		for (Object o : a) {
			System.out.println(o);
		}

	}

}
