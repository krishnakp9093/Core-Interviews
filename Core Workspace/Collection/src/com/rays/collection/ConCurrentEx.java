package com.rays.collection;

import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class ConCurrentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayBlockingQueue a = new ArrayBlockingQueue(10);//Fail-safe
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		System.out.println(a);

		Iterator it = a.iterator();
		
		a.add(5);
		a.add(6);
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
