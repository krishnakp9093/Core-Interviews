package com.oop.shapearray;

public class TestShapearrayByConstructor {
	public static void main(String[] args) {
		
	
	Shape[] s = new Shape[2];
	s[0]= new Circle(5);
	s[1]= new Rectangle(5,10);
	
	Circle c = (Circle) s[0];
	System.out.println(c.area());
	
	Rectangle r = (Rectangle) s[1];
	System.out.println(r.area());
	
	
	double a = area(s);
	System.out.println(a);
}
	
	public static double area(Shape[] s) {
		double total =0;
		for (int i = 0; i < s.length; i++) {
			total +=s[i].area();
			
		}
		return total;
		
		
	}
}
