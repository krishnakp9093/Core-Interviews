package com.collectioninterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque dequ = new ArrayDeque();
		Deque dequ1 = new LinkedList();
		
		dequ.offer(121);
		dequ.offer(122);
		dequ.offer(123);
		dequ.offer(124);
		dequ.offer(125);
		dequ.offer(126);
		
		System.out.println("dequ.offerFirst(188) : "+dequ.offerFirst(188));
		System.out.println("dequ.getFirst() : "+dequ.getFirst());
		System.out.println("dequ.peekFirst() : "+dequ.peekFirst());
		System.out.println("dequ.poll() : "+dequ.poll());//provide first and remove it 
		System.out.println(dequ);
		System.out.println("dequ.pop() : "+dequ.pop());//provide first and remove it 
		System.out.println(dequ);
		System.out.println("dequ.pollFirst() : "+dequ.pollFirst());
		
		
	}

}
