package com.practice;

public class ChackedExceptionPropogation {
	
	public static void main(String[] args) {
		dad();
		System.out.println("dad");
	}

	private static void dad() {

		try {
			mom();
		} catch (MistakeException e) {

			System.out.println(e.getMessage());
		}
	}

	private static void mom() throws MistakeException{
		son();
	}

	private static void son() throws MistakeException {

		throw new MistakeException();
		
	}

}
