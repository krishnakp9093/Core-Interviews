package com.mystream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethodsExample {
	
	public static void main(String[] args) {


		List<String> list = Arrays.asList("One", "Two", "Three", "Three", "Four");

		Stream<String> stream = list.stream();
		
		System.out.println("------1--------");
		
		// Print all elements from stream
		stream.forEach(e -> {
		 System.out.println(e);
		});
		
		System.out.println("------2--------");
		
		//For Sorting
		list.stream().sorted().forEach(e -> {
			System.out.println(e);
		});
		
		System.out.println("------3--------");
		
		//To Uppercase
		list.stream().map(e -> e.toUpperCase()).forEach(e -> {
			System.out.println(e);
		});

		System.out.println("------4--------");
		
		//Filter elements starting with T character
		list.stream().distinct().filter(e -> e.startsWith("T")).map(e -> e.toUpperCase()).forEach(e -> {
			System.out.println("STREAM  :  "+e);
		});

		System.out.println("------5--------");
		
		//Remove duplicate elements
		list.stream().filter(e -> e.startsWith("T")).distinct().map(e -> e.toUpperCase()).forEach(e -> {
			System.out.println(e);
		});
		
		System.out.println("------6--------");
		
		//All together 
		list.stream().filter(e -> e.startsWith("T")).distinct().map(e -> e.toUpperCase()).sorted().forEach(e -> {
			System.out.println(e);
		});
		
		System.out.println("------7--------");
		
		//Get collection from Stream
		List<String> l = list.stream().filter(e -> e.startsWith("T")).distinct().map(e -> e.toUpperCase()).sorted().collect(Collectors.toList());
	}

}