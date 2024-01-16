package com.collection3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseUsingStream {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(5, 6, 7, 8);

		// reserse stream and print elements
		// stream.collect(Collectors.toCollection(LinkedList::new)).descendingIterator()
		// .forEachRemaining(System.out::println);

		stream.sorted(Comparator.reverseOrder()).forEach(System.out::println);

	}

}
