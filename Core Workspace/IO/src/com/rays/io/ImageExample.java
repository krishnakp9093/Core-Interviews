package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageExample {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("E://IOFiles//image1.jpeg");
		FileOutputStream fos = new FileOutputStream("E://IOFiles//image2.jpeg");
		
		int i = fis.read();
		
		while(i != -1) {
			fos.write(i);
			i = fis.read();
		}
		fis.close();
		fos.close();
		
		System.out.println("Success...");		
	} 
}
