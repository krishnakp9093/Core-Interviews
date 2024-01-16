package com.collectionpractice;

public class Ccomparatr {
	
	public int id;
	public String name;
	public int salary;
	
	public Ccomparatr(int id , String name , int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString() {
		return id+" "+name+" "+salary;
	}
	

}
