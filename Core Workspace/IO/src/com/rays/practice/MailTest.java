package com.rays.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class MailTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("E://IOFiles//mail.txt"));

		FileWriter fw = new FileWriter("E://IOFiles//mailwrite.txt");

		PrintWriter pw = new PrintWriter(fw);

		String s = br.readLine();

		String regex = "^[_A-Za-Z0-9],(\\[_A-Za-Z0-9].*@[_A-Za-a0-9].[_A-ZA-Z0-9].";
		if (s != null) {
			if (s.equals(regex)) {
				pw.println(s);
				System.out.println(s);
			}
			s = br.readLine();
		}
		pw.close();

	}

}
