package com.collection2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListDuplicateElement {

	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<>();
		name.add("Pushpendra");
		name.add("Indra");
		name.add("Himanshu");
		name.add("Kuldeep");
		name.add("Rohit");
		name.add("Komal");
		name.add("Himanshu");
		name.add("Kuldeep");
		
		Set<String> s = new HashSet<>();
		
		for (String str : name) {
			if(s.add(str)==false)
			System.out.println(str);
		}
	}
}