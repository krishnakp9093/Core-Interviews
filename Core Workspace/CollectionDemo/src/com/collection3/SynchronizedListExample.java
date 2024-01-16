package com.collection3;

import java.util.ArrayList;
import java.util.Collections;

public class SynchronizedListExample {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");

		Collections.synchronizedList(list);

		for (String value : list)

			System.out.println(value);

	}

}
