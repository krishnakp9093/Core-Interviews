package com.rays.practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestAppend {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw = new FileWriter("adfs",true);
		fw.write("Raj");
		fw.close();		
	}

}
