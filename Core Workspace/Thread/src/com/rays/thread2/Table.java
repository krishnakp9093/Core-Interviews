package com.rays.thread2;

public class Table {

	public synchronized void printtable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
		}
	}

}
