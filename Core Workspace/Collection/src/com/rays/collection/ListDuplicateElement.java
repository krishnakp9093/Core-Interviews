package com.rays.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(1);

		System.out.println(list);

		Set set = new HashSet();

		for (Object o : list) {
			while (set.add(o) == false) {

			}
			System.out.println(o);
		}

	}

}
