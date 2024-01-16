package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class TextAppendIntoExistingFileExample {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("E://IOFiles//mail.txt", true);

		fw.write(" Rohit@gmail.com");
		fw.close();
		System.out.println("Append Successfully.....");
	}
}
