package com.collection.book;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDuplicateElement {
	public static void main(String[] args) {
		List<String> l = new ArrayList();
		l.add("rohit");
		l.add("ram");
		l.add("shyam");
		l.add("ram");
		l.add("shubham");
		l.add("rohit");
		
		Set<String> s = new HashSet<String>();
		for(String str : l) {
			if(s.add(str) == false)  
				System.out.println(str);
			}
		}
		
	}


