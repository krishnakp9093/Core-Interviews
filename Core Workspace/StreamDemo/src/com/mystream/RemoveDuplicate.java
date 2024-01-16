package com.mystream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicate {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("One", "Two", "Three", "Three", "Four");

		// Stream<String> stream = list.stream();

		List<String> distinctItems = list.stream().distinct().collect(Collectors.toList());

		// list.stream().distinct().forEach(System.out::println);

		System.out.println(distinctItems);
	}
}
