package com.assignments.day2;

public class Ford extends Car {
	public Ford(int s, double p, String c, int year, int manfacturerDiscount) {
		super(s, p, c);
		// TODO Auto-generated constructor stub
	}
	int year;
	int manufacturerDiscount;
	public double getSalePrice() {
		return regularPrice+100-manufacturerDiscount;
		
	}
	
	
}
