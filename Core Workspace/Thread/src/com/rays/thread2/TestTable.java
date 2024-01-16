package com.rays.thread2;

public class TestTable {
	public static void main(String[] args) {

		Table table = new Table();
		Table1 t = new Table1(table);
		t.start();
	}

}
