package com.collectionpractice;

import java.util.ArrayList;

public class TestColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList list = new ArrayList();
		
		list.add(12);
		list.add(11);
		list.add(15);
		
		ArrayList list2 = new ArrayList(list);
		
		System.out.println(list2);
		
		list2.add(177);
		
		System.out.println(list2);

	}

}
