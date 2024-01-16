package com.collection3;

public class FindDuplicateFromArray {

	public static void main(String[] args) {

		char arr[] = { 'a', 'e', 'b', 'd', 'c', 'd', 'e' };
		int count;

		System.out.println("Duplicate elements in a given string: ");

		for (int i = 0; i < arr.length; i++) {
			count = 1;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j] && arr[i] != ' ') {
					count++;

					arr[j] = '0';

				}

			}

			if (count > 1 && arr[i] != '0')
				System.out.println(arr[i]);

		}

	}

}
