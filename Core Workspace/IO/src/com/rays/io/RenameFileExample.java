package com.rays.io;

import java.io.File;
import java.io.IOException;

public class RenameFileExample {

	public static void main(String[] args) throws IOException{
		File f = new File("E://IOFiles//Gogo.txt");
		File f1 = new File("E://IOFiles//Gogo1.txt");
		
		if(f.exists()) {
			System.out.println(f.renameTo(f1));
		}else{
			System.out.println("File does not exists");
		}
	}
}