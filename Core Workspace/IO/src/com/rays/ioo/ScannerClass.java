package com.rays.ioo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) throws IOException {
		File f = new File("E://IOFiles//mail.txt");
		Scanner s = new Scanner(f);
		while(s.hasNext()) {
			String line = s.nextLine();
			System.out.println(line);
		}
	}

}
