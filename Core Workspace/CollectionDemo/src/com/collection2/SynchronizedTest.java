package com.collection2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedTest extends Thread {
	
	private static Map<String, Integer> hm = Collections.synchronizedMap(new HashMap<String, Integer>());
	
	public void run() {
		hm.put("Four", 4);
	}
	
	public static void main(String[] args) {
		hm.put("one", 1);
		hm.put("Two", 2);
		hm.put("Three", 3);
		
		SynchronizedTest t1 = new SynchronizedTest();
		t1.start();
		
		for (Object o : hm.entrySet()) {
			System.out.println(o);
		}
		
		System.out.println(hm);
	}
}


