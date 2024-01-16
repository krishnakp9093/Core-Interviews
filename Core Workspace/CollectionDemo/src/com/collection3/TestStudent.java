package com.collection3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Vipin","Gupta");
		Student s2 = new Student(2,"Aman","Kumar");
		Student s3 = new Student(3,"Vipin","Singh");
		Student s4 = new Student(4,"Aman","Gupta");
		
		List<Student> list = new ArrayList ();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		Collections.sort(list,new StudentCom());
		
		Collections.reverse(list);
		Iterator<Student> it = list.iterator();
		
		while (it.hasNext()) {
			Student s = it.next();
			
			System.out.println(s.getId() + " " + s.getFname()+" "+ s.getLname());
			
		}
	}
}
