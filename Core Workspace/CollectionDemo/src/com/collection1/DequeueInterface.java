package com.collection1;

import java.util.*;

public class DequeueInterface {
public static void main(String[] args) {
	
	//creating object of ArrayDeque class
	ArrayDeque a = new ArrayDeque();
	
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	a.add(5);
	System.out.println(a);
	
	System.out.println();
	
	a.addFirst(7);  //it will insert 7 at first place
	System.out.println(a);
	System.out.println();
	
	a.addLast(8);
	System.out.println(a);//it will insert 8 at last place
}
}
