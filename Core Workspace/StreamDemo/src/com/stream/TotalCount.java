package com.stream;

import java.util.Arrays;
import java.util.List;

public class TotalCount {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		long count = list.stream().count();
		System.out.println(count);
	}

}
