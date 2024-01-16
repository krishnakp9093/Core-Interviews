package com.collection3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {

		int j = 1;
		ArrayList list = new ArrayList();
		for (int p = 1; p <= 10000; p++) {
			list.add(p);
		}
		Random r = new Random();
		for (int i = 1; i <= 50; i++) {
			int p = r.nextInt(1000);
			System.out.println(j++ + "  " + list.get(p));
		}
		HashSet hs = new HashSet();

		System.out.println(hs.add(list));

	}
}
