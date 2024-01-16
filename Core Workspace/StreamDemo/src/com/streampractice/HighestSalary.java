package com.streampractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		list.add(5000);
		list.add(10000);
		list.add(15000);
		list.add(25000);
		
		list.stream().sorted(Collections.reverseOrder()).findFirst().ifPresent(System.out::println);
	}

}
