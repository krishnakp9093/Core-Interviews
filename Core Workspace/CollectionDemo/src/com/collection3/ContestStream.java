

package com.collection3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ContestStream {

	public String name;
	public String phone;

	public ContestStream(String n, String p) {

		name = n;
		phone = p;
	}

	public static void main(String[] args) {

		ArrayList<ContestStream> list = new ArrayList<ContestStream>();

		list.add(new ContestStream("kapil", "9874563210"));
		list.add(new ContestStream("Yash", "9597499655"));
		list.add(new ContestStream("Dheeraj", "987"));
		list.add(new ContestStream("Vineet", "9811144785"));
		list.add(new ContestStream("Vishu", "93214569"));
		list.add(new ContestStream("Rohan", "7895541203"));
		list.add(new ContestStream("Mayank", "9846532710"));

		// for number
//		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
//				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
//					Collections.shuffle(e);
//					return e.stream();
//				})).limit(3).forEach(e -> System.out.println(e));
//		
       // for name
		list.stream().map(n -> n.name).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), n -> {
					Collections.shuffle(n);
					return n.stream();
				})).limit(3).forEach(n -> System.out.println(n));
		
		

	}

}
