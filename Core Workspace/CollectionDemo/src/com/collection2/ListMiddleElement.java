package com.collection2;

import java.util.ArrayList;

public class ListMiddleElement {
	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<>();
		name.add("Pushpendra");
		name.add("Indra");
		name.add("Himanshu");
		name.add("anshu");
		name.add("Kuldeep");
		name.add("Rohit");
		name.add("Komal");
		name.add("Himanshu");
		name.add("Kuldeep");
		
		String str =  name.get((name.size()-1)/2);
		System.out.println(str);
		
	}
}
