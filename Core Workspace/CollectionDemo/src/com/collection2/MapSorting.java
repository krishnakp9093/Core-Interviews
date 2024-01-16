package com.collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapSorting {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "kapil");

		Stream<String> s = map.values().stream().sorted();

		
	}

	public static Stream<String> sorting(Map<Integer, String> map) {

		return map.values().stream().sorted();

	}

}
