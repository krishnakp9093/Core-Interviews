package com.collection2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableTest {

	public static void main(String[] args) {
		List<ComparableEx> list=Arrays.asList(new ComparableEx (1,"Pushpendra","111"), 
				new ComparableEx (2,"Lucky","122"),new ComparableEx (3,"Gauri","133"));
		
		Collections.sort(list);
		//list.forEach(System.out::println);
		list.forEach(e->System.out.println(e));
	}
}
