package com.exception03;

public class CheckedExceptionEx {
	public static void main(String[] args) {
		dad();
	}
	public static void dad() {
		try {
			mom();
		} catch (Exception e) {
			System.out.println("ee");
			e.printStackTrace();
		}
	}
	public static void mom() throws Exception {
		son();
	}

	public static void son() throws Exception {
		System.out.println("son.......");
		throw new Exception();
	}
}
