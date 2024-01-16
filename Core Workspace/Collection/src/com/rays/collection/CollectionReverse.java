package com.rays.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionReverse {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(5);
		list.add(15);
		list.add(21);

		Collections.reverse(list);

		System.out.println(list);

	}
}
