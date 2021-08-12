package com.sonata.Day03Assignment;

public class Square extends Shape {

	public Square(double l, double w, double h) {
		super(l, w, h);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double area(double l, double w,double h) {
		return l*w;
	}
}
