package com.rays.io;

import java.io.File;

public class FileDirectoryExample2 {

	public static void main(String[] args) {
		File directory = new File("E:\\");//folder name
		String[] list = directory.list();
			
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

}
