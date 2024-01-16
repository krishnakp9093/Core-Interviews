package com.collection3;

import java.util.Arrays;
import java.util.List;

public class RemoveDupInt {

	public static void main(String[] args) {
		
		List list = Arrays.asList(2,3,4,4,3,2,5,5,2,3);
		
		list.stream().distinct().forEach(e->System.out.println(e));
	}
}
