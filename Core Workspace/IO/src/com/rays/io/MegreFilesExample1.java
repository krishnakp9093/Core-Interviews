package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MegreFilesExample1 {
	public static void main(String[] args) throws IOException {

		// writing file
		String s = "E:\\IOFiles/Amerged.txt";
		int count = 0;
		int nol = 0;
		File f = new File(s);

		int nof = 6;
		String strLine;
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));

		for (int j = 1; j <= nof; j++) {
			count = 0;
			String s1 = "E:\\IOFiles\\SpilitedFiles"+j+".txt";
			BufferedReader br = new BufferedReader(new FileReader(s1));
			File f1 = new File(s1);
			Scanner scn = new Scanner(f1);

			while (scn.hasNext()) {
				scn.next();
				count++;
			}
			System.out.println("No of lines = " + count);

			nol = count;
			bw.newLine();

			for (int i = 1; i <= nol; i++) {
				strLine = br.readLine();
				if (strLine != null) {
					bw.write(strLine);

					System.out.println(strLine);

					if (i < nol) {

						bw.newLine();
					}

				}
			}
			br.close();
		}
		bw.close();

	}

}