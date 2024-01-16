package com.mystream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertArrayToStream {

	public static void main(String[] args) {

		String[] letters = { "a", "b", "c", "d", "e" };

		// convert part of the array to a stream
		Stream<String> stream = Arrays.stream(letters);

		//System.out.println(stream); //->provide object
		stream.forEach(System.out::println);
	}

}
