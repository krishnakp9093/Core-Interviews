package com.collectionpractice;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		
		list.add(111);
		list.add(113);
		list.add(444);
		list.add(56);
		
		ListIterator li =list.listIterator();
		
		list.add(11122);
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		

	}

}
