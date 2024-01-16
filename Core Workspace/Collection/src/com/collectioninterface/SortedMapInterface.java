package com.collectioninterface;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortedMap tMap = new TreeMap();
		

		tMap.put(101, 'a');
		tMap.put(102, 'b');
		tMap.put(103, 'c');
		tMap.put(104, 'd');
		tMap.put(105, 'e');
		
		
		System.out.println("tMap.lastKey() : "+tMap.lastKey());
		System.out.println("tMap.firstKey() : "+tMap.firstKey());
		System.out.println("tMap.entrySet() : "+tMap.entrySet());
		System.out.println("tMap.tailMap(103) : "+tMap.tailMap(103));
		System.out.println("tMap.subMap(102, 104) : "+tMap.subMap(102, 104));
		
		
	}

}
