package com.collection2;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
	
	public static void main(String[] args) {

		System.out.println("------------Arrays---------------");
		String[] arr = { "One", "Two", "Three", "Four" };
		Stream<String> stream1 = Arrays.stream(arr);

		stream1.forEach(s -> System.out.print(s));
		System.out.println();
		System.out.println("------------List---------------");
		List<String> items = Arrays.asList("One", "Two", "Three", "Four");
		Stream<String> stream = items.stream();
		stream.forEach(s -> System.out.print(s));
		System.out.println();
		//System.out.println("------------IO---------------");
		List<String> io = Arrays.asList("One", "Two", "Three", "Four");
		//Stream<String> file = Files.lines(path.o)

		System.out.println("------------.---------------");
		List<String> l = items.stream().filter(e -> e.startsWith("T")).distinct().map(e -> e.toUpperCase()).sorted()
				.collect(Collectors.toList());

		l.forEach(a -> System.out.println(a));

	}
}