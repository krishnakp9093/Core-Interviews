package com.practice;

import java.io.FileInputStream;

public class Test {

	public static void main(String[] args) {
		try {

			FileInputStream fis = new FileInputStream("abc.txt");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
