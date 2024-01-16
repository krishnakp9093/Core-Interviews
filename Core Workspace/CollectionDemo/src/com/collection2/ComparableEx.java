package com.collection2;

public class ComparableEx implements Comparable<ComparableEx> {
	int id;
	String name;
	String phoneNo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public ComparableEx(int i, String name, String phoneNo) {
		// TODO Auto-generated constructor stub

		this.id = i;
		this.name = name;
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "ComparableEx [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + "]";
	}

	@Override
	public int compareTo(ComparableEx o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

}
