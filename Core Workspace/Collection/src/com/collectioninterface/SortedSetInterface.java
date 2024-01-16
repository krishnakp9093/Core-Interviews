package com.collectioninterface;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterface {

	public static void main(String[] args) {

		SortedSet tSet = new TreeSet();
		

		tSet.add(121);
		tSet.add(122);
		tSet.add(123);
		tSet.add(124);
		tSet.add(125);
		tSet.add("abc");

	//	System.out.println("tSet.ceiling(122) : "+((TreeSet) tSet).ceiling(122));
	//	System.out.println("tSet.contains(12) : "+tSet.contains(12));
	//	System.out.println("tSet.pollFirst() : "+((TreeSet) tSet).pollFirst());
	//	System.out.println("tSet.subSet(121, 124) : "+tSet.subSet(121, 124));
		
		
		System.out.println("tSet.first() : "+tSet.first());
		System.out.println("tSet.last() : "+tSet.last());
		System.out.println("tSet.size() : "+tSet.size());
		System.out.println("tSet.tailSet(123) : "+tSet.tailSet(123));
		System.out.println("tSet.headSet(124) : "+tSet.headSet(124));
		
	}

}
