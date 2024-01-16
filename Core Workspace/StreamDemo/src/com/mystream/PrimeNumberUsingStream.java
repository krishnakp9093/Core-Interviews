package com.mystream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumberUsingStream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 3, 4, 5, 7, 8, 10, 11, 13, 12, 17, 21, 23, 28, 23);

		list.stream().filter(x -> isPrime(x)).forEach(y -> System.out.print(y + " "));
	}

	private static boolean isPrime(Integer x) {

		int count = 0;
		
		for (int i = 2; i <= x - 1; i++) {

			if (x % i == 0) {
				count++;
			}

		}

		return count == 0;

	}
}