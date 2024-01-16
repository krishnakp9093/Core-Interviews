package com.collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ContestentWinner {
	public static void main(String[] args) {

		ArrayList<Contestent> list = new ArrayList<Contestent>();
		list.add(new Contestent("ram", "7896541236"));
		list.add(new Contestent("Shyam", "9912342222"));
		list.add(new Contestent("Ajay", "7896541236"));
		list.add(new Contestent("Vijay", "9912345678"));
		list.add(new Contestent("Jay", "9912345888"));
		list.add(new Contestent("Pappu", "9912345111"));
		list.add(new Contestent("InvalidNO", "11"));

		System.out.println("----Get the Phone Number ");
		list.stream().map(e -> e.phone).filter(f -> f.length() == 10).forEach(s -> {
			System.out.println(s);
		});

		System.out.println("---------------");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(e -> System.out.println(e));

	}

}
