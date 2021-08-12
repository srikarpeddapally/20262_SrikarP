package com.assignments.day2;

public class Car {
	int speed;
	double regularPrice;
	String color;
	double SalePrice;
	
	public Car(int s, double p, String c) {
		this.speed=s;
		this.regularPrice=p;
		this.color=c;
	}

	public double getSalePrice() {
		SalePrice=regularPrice+100;
		return SalePrice;
	}
	
}
