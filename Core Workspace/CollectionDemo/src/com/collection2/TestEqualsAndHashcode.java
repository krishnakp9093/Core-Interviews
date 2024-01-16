package com.collection2; 

public class TestEqualsAndHashcode {
	
public static void main(String[] args) {
	
	EqualsAndHashcode e=new EqualsAndHashcode(31);
	EqualsAndHashcode e1=new EqualsAndHashcode(31);
	
	System.out.println(e.equals(e1));
	System.out.println(e.hashCode());
	System.out.println(e1.hashCode());
}
}
