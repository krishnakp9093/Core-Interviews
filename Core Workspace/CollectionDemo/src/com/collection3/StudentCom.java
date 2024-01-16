package com.collection3;

import java.util.Comparator;

public class StudentCom implements Comparator<Student> {

	
	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getFname() == o2.getFname()) {
			return o1.getLname().compareTo(o2.getLname());
		}else {
			return o1.getFname().compareTo(o2.getFname());
		}
		
	}

}
