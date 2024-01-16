package com.rays.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Spilit {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String s = "E:\\IOFiles/BeforeSpilit.txt";
		int count = 0;
		int nol = 2;
		File f = new File(s);

		Scanner sc = new Scanner(f);

		while (sc.hasNext()) {
			sc.next();
			count++;
		}

		System.out.println("number of lines" + count);

		int temp = count / nol;
		int rem = count % nol;
		int nof = 0;

		if (temp != 0) {
			nof = temp;

			if (rem != 0) {
				nof++;
			} else {
				nof = temp;
			}
		}

		System.out.println("No of file = " + nof);

		BufferedReader br = new BufferedReader(new FileReader(s));

		String strLine;
		for (int i = 1; i <= nof; i++) {
			BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\IOFiles/SpilitedFiles" + i + ".txt"));
			;

			strLine = br.readLine();

			for (int j = 1; j <= nol; j++) {
				if (strLine != null) {

					bw.write(strLine);

					strLine = br.readLine();

					if (j != nol) {
						System.out.println("11");
						bw.newLine();
					}
				}
			}
			bw.close();
		}
		br.close();

	}

}
