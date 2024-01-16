package com.rays.demo;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileWithScanner {
	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader("E://IOFiles//mail.txt");
		
		 Scanner sc = new Scanner(file);

		 while(sc.hasNext()) {
			 String s = sc.nextLine();
			 System.out.println(s);
		 }

		file.close();
	
		
	}
}