package com.collectionpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add("four");
		list.add("three");

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
