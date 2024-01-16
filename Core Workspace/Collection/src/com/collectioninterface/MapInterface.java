package com.collectioninterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap map = new HashMap();
		
		map.put(101, 'a');
		map.put(102, 'b');
		map.put(103, 'c');
		map.put(104, 'd');
		map.put(105, 'e');
		
		
		System.out.println("Hashmap Methods");
		
		System.out.println(map);
		System.out.println("map.size() : "+map.size());
		System.out.println("map.isEmpty() : "+map.isEmpty());
		System.out.println("map.get(102) : "+map.get(102));
		System.out.println("map.containsKey(103) : "+map.containsKey(103));
		System.out.println("map.containsValue('c') : "+map.containsValue('c'));
		System.out.println("map.entrySet() : "+map.entrySet());
		System.out.println("map.keySet() : "+map.keySet());
		System.out.println("map.values() : "+map.values());
		map.clear();
		System.out.println(map);
		
		System.out.println("<----------------->");
		
		System.out.println("TreeMap Methods");
		
		TreeMap tMap = new TreeMap();
		
		
		tMap.put(101, 'a');
		tMap.put(102, 'b');
		tMap.put(103, 'c');
		tMap.put(104, 'd');
		tMap.put(105, 'e');
		
		
		System.out.println("tMap.firstKey() : "+tMap.firstKey());
		System.out.println("tMap.lastKey() : "+tMap.lastKey());
		System.out.println("tMap.firstEntry() : "+tMap.firstEntry());
		System.out.println("tMap.lastEntry() : "+tMap.lastEntry());
		
		
		LinkedHashMap map1 = new LinkedHashMap();
		
		map1.put(101, 'a');
		map1.put(102, 'b');
		map1.put(103, 'c');
		map1.put(104, 'd');
		map1.put(105, 'e');
		
		System.out.println("map1.get(102) : "+map1.get(102));
		System.out.println("map1.containsValue('d') : "+map1.containsValue('d'));
		System.out.println("map1.getOrDefault(102, null) : "+map1.getOrDefault(102, null));
		System.out.println("map1.entrySet() : "+map1.entrySet());
		System.out.println("map1.keySet() : "+map1.keySet());
		System.out.println("map1.values() : "+map1.values());
	}

}
