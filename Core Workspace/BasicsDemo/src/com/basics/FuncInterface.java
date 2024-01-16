package com.basics;

//the interface which have exactly single abstract method known as
//functional interface
@FunctionalInterface
public interface FuncInterface {
	public int sum(int a, int b);
	
	
	public static void multi(int a, int b) {
		System.out.println(a*b);
	}
	public default void sub(int a, int b) {
		System.out.println(a-b);
	}
	
}