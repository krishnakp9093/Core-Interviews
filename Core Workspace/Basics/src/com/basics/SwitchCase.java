package com.basics;

public class SwitchCase {

	public static void main(String[] args) {

		int day = 10;
		String dayString = null;
		switch (day) {
		case 0:

			dayString = "sunday";
			break;

		case 1:

			dayString = "monday";
			break;

		case 2:

			dayString = "tuesday";
			break;

		default:
			dayString = "Yet to come";
			break;
		}

		System.out.println(dayString);
	}

}
