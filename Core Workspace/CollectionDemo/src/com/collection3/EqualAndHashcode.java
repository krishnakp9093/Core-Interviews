package com.collection3;

public class EqualAndHashcode {
	
public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "hello";
		 
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(" ");
		
		Integer i = 53;
		System.out.println(i.hashCode());		
	}

}
