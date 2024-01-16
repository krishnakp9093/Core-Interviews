package com.collectionpractice;

import java.util.ArrayList;
import java.util.Collections;

public class TestComprbleEx {

	public static void main(String[] args) {

		ComprbleEx e1 = new ComprbleEx("rohit", 101);

		ComprbleEx e2 = new ComprbleEx("sumit", 103);

		ComprbleEx e3 = new ComprbleEx("raj", 102);
		
		ArrayList list = new ArrayList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		
		
		Collections.sort(list);
		
		for(Object o : list) {
			System.out.println(o);
		}
	}

}
