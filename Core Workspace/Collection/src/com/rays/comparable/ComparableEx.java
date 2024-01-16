package com.rays.comparable;

public class ComparableEx implements Comparable<ComparableEx> {

	public String rollNo;
	public String name;
	public int marks;

	public ComparableEx(String r, String n, int m) {
		this.rollNo = r;
		this.name = n;
		this.marks = m;

	}

	@Override
	public int compareTo(ComparableEx o) {
		return o.name.compareTo(name);
	}

	/*
	 * @Override public int compareTo(ComparableEx o) { return this.marks - o.marks;
	 * }
	 */

	@Override
	public String toString() {
		return "ComparableEx [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
}
