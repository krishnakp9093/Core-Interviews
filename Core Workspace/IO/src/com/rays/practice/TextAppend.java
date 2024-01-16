package com.rays.practice;

import java.io.FileWriter;
import java.io.IOException;

public class TextAppend {
	
	public static void main(String[] args) throws IOException {
		
	FileWriter fw = new FileWriter("E://IOFiles//mail.txt" , true);
		
	fw.write("Krishhna@gmail.com");
	fw.close();
	System.out.println("Append Successfully");
		
	}
}
