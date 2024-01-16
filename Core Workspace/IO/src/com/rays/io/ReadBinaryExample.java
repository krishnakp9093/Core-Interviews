package com.rays.io;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadBinaryExample {

	public static void main(String[] args)throws IOException {
		FileInputStream fis = new FileInputStream("E://IOFiles//image1.jpeg");
		
		int i = fis.read();
		while(i != -1) {
			System.out.print((char)i);
			i = fis.read();
		}
		fis.close();
	}

}
