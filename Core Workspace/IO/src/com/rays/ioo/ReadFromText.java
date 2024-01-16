package com.rays.ioo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromText {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E://IOFiles//mail.txt");
		BufferedReader br = new BufferedReader(fr);
		int ch = br.read();
		String line = br.readLine();
		System.out.println(line);
		// int ch = fr.read();

		char chr;
		while (ch != -1) {
			chr = (char) ch;
			System.out.println(chr);
			ch = fr.read();
		}

		fr.close();
	}

}
