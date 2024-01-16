package com.collection3;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Take a array & convert into stream then remove duplicates & sort & get 3 value then again convert into array

public class ArraytoStrtoArr {

	public static void main(String[] args) {

		//String[] let = { "one", "two", "two", "four", "four" };//for String
		 int[] let = {1,2,3,4,4,4,5,5,5,6,7,8}; // for int Array

		//Stream<String> stream = Arrays.stream(let);//for String
		 IntStream stream = Arrays.stream(let); //for int Array

		//String[] s = stream.distinct().sorted().limit(2).toArray(size -> new String[size]);//for String
		 int [] s = stream.distinct().sorted().limit(4).toArray(); // for int Array

		for (int string : s) {//Convert int to String or
			System.out.println(string);
		}
	}
}
