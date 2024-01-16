package com.collection1;

public class EqualsAndHashCode {
public static void main(String[] args) {
	String s1 = "Rathore";
	String s2 = "Rathore";
	
	System.out.println(s1.equals(s2));//check the values of String
	
	System.out.println(s1.hashCode());//return the hashcode of the value
	System.out.println(s2.hashCode());

  
 }
}
