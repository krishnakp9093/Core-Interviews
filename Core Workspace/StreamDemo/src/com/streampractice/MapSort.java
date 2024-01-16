package com.streampractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapSort {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("Rahul", 100);
		map.put("Karan", 90);
		map.put("pushpendra", 50);
		map.put("Ram", 20);
		map.put("Krishhna", 10);
		
		Map<String, Integer> sort = new LinkedHashMap<>();
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(e -> sort.put(e.getKey(), e.getValue()));
	
		System.out.println(sort);
	
	}

}
