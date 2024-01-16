package com.rays.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Spilit2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String s = "";
		int nol = 2;
		int count = 0;
		
		File f = new File(s);
		Scanner sc = new Scanner(f);
		while (sc.hasNext()) {
			sc.next();
			count++;
		}
		
		System.out.println(count);
		
		int temp = count/nol;
		int rem =count%nol;
		int nof = 0;
		
		if(temp != 0) {
			nof = temp;
        if(rem !=0) {
        	nof++;
        }
		}
		
		System.out.println();
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		
		
	}

}
