package com.collectionpractice;

public class ComprbleEx implements Comparable<ComprbleEx>{

	public String name;
	public Integer rollNo;
	
	public ComprbleEx(String name , Integer rollNo) {
		this.name=name;
		this.rollNo=rollNo;
	}	
		@Override
		public int compareTo(ComprbleEx c) {
			return rollNo.compareTo(c.rollNo);
		}
	

		public String toString() {
			return name + " " +rollNo;
		}
}
