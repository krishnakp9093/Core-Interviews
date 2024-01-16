package com.collection2;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListDuplicateViaStream {
	public static void main(String[] args) {
		// List<Integer> list = Arrays.asList(1,3,4,5,5,6,6,7);

		List<String> list = new ArrayList<>();

		list.add("rays");
		list.add("rays");
		list.add("indore");
		list.add("gwalior");
		list.add("psk");
		list.add("psk");

		list.stream().filter(e -> Collections.frequency(list, e) > 1).distinct().forEach(e -> System.out.println(e));

		/*
		 * List duplicatelist = new ArrayList();
		 * 
		 * for (int i = 0; i < list.size(); i++) {
		 * 
		 * String str = list.get(i);
		 * 
		 * if (Collections.frequency(list, str) >= 2) { duplicatelist.add(str); } }
		 * 
		 * duplicatelist.stream().distinct().forEach(e->System.out.println(e));
		 */
	}

}
