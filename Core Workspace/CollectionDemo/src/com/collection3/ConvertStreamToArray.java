package com.collection3;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConvertStreamToArray {

	public static void main(String[] args) {

		{
			// Create a stream of integers
			Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

			// Convert Stream to array
			Object[] array = stream.toArray();
			
			// long i = stream.count();

			// Print the array of stream
			System.out.println("Array from Stream: " + Arrays.toString(array));
			 
		//	 System.out.println(i);
		}
	}

}
