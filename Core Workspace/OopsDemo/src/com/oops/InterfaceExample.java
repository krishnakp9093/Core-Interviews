package com.oops;

public interface InterfaceExample {
	public static final double A = 50;
	public String name = "Krishhna";

	
	public void add(int a);
	public int sub(int a, int b);
	/*
	 * public abstract void add2(int a); public abstract String subst(String name);
	 */
	
	public static int sub(int a) {
		return a;
	}
	
	public default int multi(int a, int b) {
		return a*b;
	}
}

