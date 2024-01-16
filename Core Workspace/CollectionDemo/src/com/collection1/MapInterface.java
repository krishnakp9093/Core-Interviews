package com.collection1;

import java.util.*;

public class MapInterface {
public static void main(String[] args) {
	

		Map m =new HashMap();
		
		m.put("first", 1);
		m.put("second", 2);
		m.put("third", 3);
		m.put("fourth", 4);
		m.put("fifth", 5); //it will element in map
		System.out.println(m);
		
		System.out.println(m.get("second"));//it will return the value of key 
								   //key
		System.out.println();
		boolean b = m.containsKey("first"); //it will return true if key is there
		System.out.println(b);
		
	
		boolean b1 = m.containsValue(4); //it will return truew if value is there
		System.out.println(b1);
		
		
		System.out.println(m.entrySet());
		
		boolean b2 = m.isEmpty(); //it will return true if map is empty
		System.out.println(b2);
		
		System.out.println(m.keySet());//it will return all keys 
		System.out.println(m.values());//it will return all values
		
		System.out.println(m.remove("third")); //it will give output of the vlaue of key 
		
		System.out.println(m.size()); //it will return the size of the map 
		
		
		
		
								  
}
}
