package com.collectioninterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet set = new HashSet();
		set.add(121);
		set.add(122);
		set.add(123);
		set.add(124);
		set.add(125);

		System.out.println("set.contains(122) : "+set.contains(122));
		System.out.println("set.isEmpty() : "+set.isEmpty());
		System.out.println("set.size() : "+set.size());
		System.out.println("set.remove(129) : "+set.remove(129));
		set.clear();
		System.out.println("------------");
		
		
		TreeSet tSet = new TreeSet();
		
		tSet.add(121);
		tSet.add(122);
		tSet.add(123);
		tSet.add(124);
		tSet.add(125);

		System.out.println("tSet.ceiling(12) : "+tSet.ceiling(12));//provide greater or equal || provide null if not greater available
		System.out.println("tSet.contains(12) : "+tSet.contains(12));
		System.out.println("tSet.first() : "+tSet.first());
		System.out.println("tSet.pollFirst() : "+tSet.pollFirst());
		System.out.println("tSet.lower(124) : "+tSet.lower(124));
		System.out.println("tSet.higher(125) : "+tSet.higher(125));
		System.out.println("tSet.size() : "+tSet.size());
		System.out.println(tSet);
		System.out.println("-----------");
		

		LinkedHashSet set1 = new LinkedHashSet();
		
		set1.add(121);
		set1.add(122);
		set1.add(123);
		set1.add(124);
		set1.add(125);

		System.out.println("set.contains(122) : "+set1.contains(122));
		System.out.println("set.isEmpty() : "+set1.isEmpty());
		System.out.println("set.size() : "+set1.size());
		System.out.println("set.remove(129) : "+set1.remove(129));
		System.out.println("set1.hashCode() : "+set1.hashCode());
		System.out.println("set1.toArray() : "+set1.toArray());
	
		
	}

}
