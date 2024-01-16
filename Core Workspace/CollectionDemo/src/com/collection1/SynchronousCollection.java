package com.collection1;

import java.util.*;

public class SynchronousCollection {
public static void main(String[] args) {
	ArrayList a = new ArrayList();//Asynchronized
	a.add(1);
	a.add(2);
	a.add(3);
	//Collection syn = Collections.synchronizedCollection(a);//Synchronized
	Collection syn  = Collections.synchronizedList(a);
	System.out.println(syn);
	
	
	HashSet hs = new HashSet();
	Set s = Collections.synchronizedSet(hs);
	
	TreeSet ts = new TreeSet();
	Set s1 = Collections.synchronizedSet(ts);
	
	HashMap hm = new HashMap();
	Map s2 = Collections.synchronizedMap(hm);
	
	TreeMap tm = new TreeMap();
	Map s3 = Collections.synchronizedMap(tm);
	
}
}
