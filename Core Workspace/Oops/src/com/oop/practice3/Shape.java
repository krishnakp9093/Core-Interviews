package com.oop.practice3;

public class Shape {
	
	public double area() {
		return 0;	
	}
	
	public static Shape getShape(int i) {

		if(i==1) {
		     
			return new Rectangle(7, 8);
		}
		if(i==2) {
			
			return new Tringle(7);
		}
		
		return new Shape();
		
	}

}
