package com.collection3;

import java.util.LinkedList;

public class MiddleNode {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();

		list.add("maynk");
		list.add("vishu");
		list.add("vineet");
		list.add("kapil");
		list.add("mayank");
		list.add("kartik");
		list.add("vipin");
		list.add("yash");
		list.add("mayankgh");
		list.add("kartikjg");
		list.add("yashdf");
		list.add("ankit");

		String middle = list.get(list.size() / 2);

		System.out.println("Middle elements:" + middle);

	}

}
