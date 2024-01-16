package com.rays.practice;

import java.io.Serializable;

public class StudentSerialisation implements Serializable {

	int id;
	String name;

	public StudentSerialisation(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}

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

	@Override
	public String toString() {
		return "StudentSerialisation [id=" + id + ", name=" + name + "]";
	}

}
