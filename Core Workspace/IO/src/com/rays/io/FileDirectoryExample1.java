package com.rays.io;

import java.io.File;

public class FileDirectoryExample1 {

	public static void main(String[] args) {
		File directory = new File("C://");
		
		File[] list = directory.listFiles();//Only file name
		for(int i = 0; i<list.length;i++) {
			if(list[i].isDirectory()) {
				System.out.println(list[i].getName());
			}
		}
	}

}
