package com.collection.book;

public class HashCodeEqualsStringTest {
	public static void main(String[] args) {
		HashCodeEqualsString s = new HashCodeEqualsString(101, "Krishhna", 1000);
		HashCodeEqualsString s1 = new HashCodeEqualsString(101, "Krishhna", 1000);

		if (s.equals(s1)) {
			if (s.hashCode() == s1.hashCode()) {
				System.out.println("equal");
			}
		} else {
			System.out.println("Not Equal");

		}
	}
}
