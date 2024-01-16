package com.mystream;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSortUsingStream {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("Rahul", 100);
		map.put("Karan", 90);
		map.put("pushpendra", 50);
		map.put("Ram", 20);
		map.put("Krishhna", 10);

		/*
		 * Map<String, Integer> sorted = (Map<String, Integer>) map.entrySet().stream()
		 * .sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::
		 * getKey, Map.Entry::getValue,
		 * (oldValue,newValue)->oldValue,LinkedHashMap::new));
		 * 
		 * System.out.println(sorted);
		 */

		// Another way
		Map<String, Integer> sort = new LinkedHashMap<>();

		map.entrySet().stream().sorted(Map.Entry.comparingByValue())// can use also comparingByValue()
				// .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))// to print in
				// descending order
				.forEach(x -> sort.put(x.getKey(), x.getValue()));

		System.out.println(sort);
	}
}
