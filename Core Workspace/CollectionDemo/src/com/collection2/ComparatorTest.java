package com.collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest {

	public static void main(String[] args) {

		ComparatorEx c1 = new ComparatorEx(1, "ram", 1000);
		ComparatorEx c2 = new ComparatorEx(4, "shyam", 5000);
		ComparatorEx c3 = new ComparatorEx(3, "mohan", 500);

		ArrayList list = new ArrayList();
		list.add(c1);
		list.add(c2);
		list.add(c3);

//		Collections.sort(list, new ShortByName());
//		Collections.sort(list, new ShortById());
		Collections.sort(list, new ShortBySalary());
		
		for(Object o :list) {
			System.out.println(o);
		}
	}
}
