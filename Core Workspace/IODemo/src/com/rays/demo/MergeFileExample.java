package com.rays.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeFileExample {

	public static void main(String[] args) throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter("E:\\IOFiles/Afterspilit1.txt"));
		
		BufferedReader br  = new BufferedReader(new FileReader("E:\\IOFiles/Afterspilit2.txt"));
		
		String s = br.readLine();
		while(s != null) {
			pw.write(s);
			s = br.readLine();
		}
		br.close();
		
		br = new BufferedReader(new FileReader("E:\\IOFiles/Afterspilit6.txt"));
		String s1 = br.readLine();
		while(s1 != null) {
			pw.write(s1);
			s1 = br.readLine();
		}
		br.close();
		pw.close();
		System.out.println("success......");
		
		
	}

}
