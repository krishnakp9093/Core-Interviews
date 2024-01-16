package com.collection1;

import java.util.*;


public class QueueInterface {
	public static void main(String[] args) {
		
		// classes of Queue interface
		
			
			Queue q1 = new ArrayDeque();
			q1.add("Amit");
			q1.add(1);
			q1.add(1.2);
			q1.add('a');
			System.out.println(q1);
		
		//methods of ArrayPriorityQueue class
			Queue q = new PriorityQueue();
			
				/*q.add(12);
				q.add(2.36);
				q.add('N');
				q.add("RATHORE");
				System.out.println(q);
				*/
			
			q.add(1);
			q.add(2);
			q.add(3);
			q.add(4);
			System.out.println(q);  //only similar datatype value can be inserted
			
			Queue a = new PriorityQueue();
			a.add(1.2);
			a.add(2.3);
			a.add(3.4);
			a.add(4.5);
			System.out.println(a);  //only similar datatype value can be inserted
			

			Queue b = new PriorityQueue();
			b.add("Amit");
			b.add("Neeraj");
			b.add("Abhay");
			b.add("Kanak");
			System.out.println(b);  //only similar datatype value can be inserted
		
		
			/*System.out.println(q.remove());
			System.out.println(q.remove());
			System.out.println(q.remove());
			System.out.println(q.remove());//remove mthod is used to access the element
			System.out.println(q.remove()); //this line will gives exception
			*/
			
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());//poll method is also used to access the element
			System.out.println(q.poll()); //this line will give null value
			
		//main difference between poll and remove method is - remove method gives exception 
		//if queue is empty
		//whereas poll method gives null value if queue is empty	

			
		

	}

}
