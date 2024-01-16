package com.collectionpractice;

import java.util.ArrayList;
import java.util.Collections;

public class ComoparableTest {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(new ComparableEx("a1", "Sakshi", 90));
		list.add(new ComparableEx("a2", "Shrashti", 70));
		list.add(new ComparableEx("a3", "Ram", 80));
		
		
	
		Collections.sort(list);
     
		for(Object o : list) {
			System.out.println(o);
		}
	
	}

}
