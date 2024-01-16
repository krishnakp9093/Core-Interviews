package com.collection3;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollection extends Thread {

	private static ConcurrentHashMap<String, Integer> hm = new ConcurrentHashMap();

	public void run() {
		hm.put("nine", 9);
	//	hm.put("Four", 4);
	}

	public static void main(String[] args) {
		
		hm.put("Five", 5);
		hm.put("One", 1);
		hm.put("Two", 2);
		hm.put("Three", 3);
		
		hm.put("Seven", 7);
		
		ConcurrentCollection t1 = new ConcurrentCollection();
		t1.start();
		for (Object o : hm.entrySet()) {
			System.out.println(o);
		}
		
		System.out.println(hm);
	}
}
