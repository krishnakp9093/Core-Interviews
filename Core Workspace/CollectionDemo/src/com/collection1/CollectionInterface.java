package com.collection1;


import java.util.*;

public class CollectionInterface {
public static void main(String[] args) {
	
		//list interface and its classes
			//List l = new ArrayList();
			//List l1 = new LinkedList();
			//List l2 = new Vector();
	
		 
			//set interfaces and its classes
			//Set l = new HashSet();
			//Set l1 = new LinkedHashSet();
	  
	
			//Queue interface and its classes
			//Queue l = new ArrayDeque();
			//Queue l1 = new PriorityQueue();
		
	
	
		//These methods are common in all collection interfaces
	List l = new ArrayList();
	l.add(12);
	l.add('b');
	l.add('a');
	l.add("RATHORE");  //it will add ements in list
	System.out.println(l);//taking output 
	//[12, b, a, RATHORE]
	
	/*for(Object obj : l) { //taking output using for each loop
		System.out.println(obj);
	}*/
	
	List a = new ArrayList();
	a.add('a');
	a.add('b');
	a.add('c');
	a.add('d');

	l.retainAll(a);//it will return the common elements
	System.out.println("retainAll :" + l);//[b, a]
	
	l.addAll(a);       //it will add all elements of a into l
	System.out.println("addAll : "+l);//[b, a, a, b, c, d]
	
	

	boolean b = l.contains('N');  //if element is there it will return true  
	System.out.println(b);//false

	
	boolean b1 = l.containsAll(a); //if all element of a is present in list l it will return trues
	System.out.println(b1);//true
	
	
	boolean b2 = l.isEmpty();  //it will return true if list is empty
	System.out.println(b2);//false
	
	
	l.remove(3);   //it will remove element from the index no 3
	System.out.println(l);//[b, a, a, c, d] 
	
	
	l.removeAll(a);			//it will remove all elements of a from list l
	System.out.println(l);//[]
	
	
	
	int i = l.size();		//it will return size of the list
	System.out.println(i);//0
	

	
	
	
	l.clear();			//it will clear whole list
	System.out.println(l);//[]
	

}
}
