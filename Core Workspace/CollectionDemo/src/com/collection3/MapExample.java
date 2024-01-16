package com.collection3;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("1", "one");
		map.put("2", "two");
		map.put("3", "three");
		
		Set kv= map.entrySet();
		
		for (Object object : map.entrySet()) {
			System.out.println(object);
		}
		
		System.out.println(kv);
	}
}
