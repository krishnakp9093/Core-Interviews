package com.collection3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class FailFastExample {

	public static void main(String[] args) {

		 //List list= new ArrayList(); //fail fast
		//using concurrent collection
		ArrayBlockingQueue<Integer> list = new ArrayBlockingQueue<>(5);//fail safe
		list.add(1);
		list.add(2);
		list.add(3);

		Iterator it = list.iterator();
		list.add(4);
		list.add(5);
	
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
