package com.collectionpractice;

import java.util.ArrayList;
import java.util.Collections;

public class Ctest {

	public static void main(String[] args) {

		Ccomparatr c1 = new Ccomparatr(1 ,"raj",1000);
		Ccomparatr c2 = new Ccomparatr(1 ,"ram",10000);
		Ccomparatr c3 = new Ccomparatr(1 ,"rohan",2000);
		
		ArrayList list = new ArrayList();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		//Collections.sort(list, new CShortById());
		//Collections.sort(list, new CsortByName());
		Collections.sort(list, new CsortBySalary());
		
		for(Object o :list) {
			System.out.println(o);
		}
		
	}

}
