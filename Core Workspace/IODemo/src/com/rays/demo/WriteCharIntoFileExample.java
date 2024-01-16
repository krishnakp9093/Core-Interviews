package com.rays.demo;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCharIntoFileExample {

	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("E://IOFiles//mail.txt");
		
		char[] ch = {'H','i'};
		fw.write(ch);
		fw.write(',');
		fw.write("krishhna...");
		fw.close();
		
		System.out.println("Successfull......");
	}

}
