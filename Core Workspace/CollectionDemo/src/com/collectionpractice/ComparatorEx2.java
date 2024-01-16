package com.collectionpractice;

public class ComparatorEx2 {

	public int id;
	public String name;
	public int salary;


	public ComparatorEx2(int id ,String name,int salary) {
		this.id= id;
		this.name= name;
		this.salary=salary;
		
	}


	@Override
	public String toString() {
		return "ComparatorEx [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
