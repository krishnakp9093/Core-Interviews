package com.collection3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElementUsingStream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5, 6, 7, 5, 6, 7, 8, 8, 3, 4,5,5,5);

		Set<Integer> dup = list.stream().filter(e -> Collections.frequency(list, e)>1).collect(Collectors.toSet());

		System.out.println(dup);
	
	
	//second way by using set
	
	Set<Integer> duplicate = new HashSet<Integer>();
	
	Set<Integer> dup1 = list.stream().filter(e->!duplicate.add(e)).collect(Collectors.toSet());
	
	System.out.println(dup1);

}
}