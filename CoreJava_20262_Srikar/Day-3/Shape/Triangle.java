package com.sonata.Day03Assignment;

public class Triangle extends Shape {

	public Triangle(double l, double w, double h) {
		super(l, w, h);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double area(double l, double w, double h) {
		return 0.5*l*h;
	}
	

}
