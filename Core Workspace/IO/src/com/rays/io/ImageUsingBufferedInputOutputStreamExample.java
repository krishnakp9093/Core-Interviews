package com.rays.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class ImageUsingBufferedInputOutputStreamExample {

	public static void main(String[] args) throws IOException{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E://IOFiles//image3.jpeg"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E://IOFiles//image4.jpeg"));
		
		byte[] buffer = new byte[256];
		int i = bis.read(buffer);
		
		while(i > 0 ) {
			bos.write(buffer,0,i);
			i = bis.read(buffer);
		}
		System.out.println("Success.....");
		bos.close();
		bis.close();
	}

}
