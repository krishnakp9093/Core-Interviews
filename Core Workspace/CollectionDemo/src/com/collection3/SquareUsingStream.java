package com.collection3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareUsingStream {
	
	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(2,3,4,5);
		
		  
	    // demonstration of map method
	    List<Integer> square = number.stream().map(x -> x*x).
	                           collect(Collectors.toList());
	   // number.stream().map(e-> e*e).forEach(System.out::println);
	    System.out.println(square);
		
	}

}
