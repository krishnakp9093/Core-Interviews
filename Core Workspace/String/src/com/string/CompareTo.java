package com.string;

 /*
  *compares the strings in Lexicographically way and  
  *by their ASCII values substract from each other
  *
  */
public class CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "A";//65
		String s2 = "a";//97
		String s3 = "";//provides the s1 no of characters 
		System.out.println(s1.compareTo(s2));//s1-s2
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.compareTo(s3));

	}

}
