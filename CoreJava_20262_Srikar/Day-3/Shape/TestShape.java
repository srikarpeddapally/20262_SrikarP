package com.sonata.Day03Assignment;

public class TestShape {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(2.5,4.8,0);
		System.out.println("Area of Rectangle " + r1.area(2.5, 4.8, 0));
		Square s1= new Square(2.8,4.6,0);
		System.out.println("Area of Square "+ s1.area(2.8, 4.7, 0));
		Triangle t1 = new Triangle(3.2,0,4.6);
		System.out.println("Area of Triangle "+t1.area(3.2, 0, 4.5));
	}
}
