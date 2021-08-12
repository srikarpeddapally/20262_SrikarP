package com.assignments.day2;

public class Truck extends Car{
	public Truck(int s, double p, String c) {
		super(s, p, c);
		// TODO Auto-generated constructor stub
	}
	int weight;
	public double getSalePrice() {
		if(weight>2000) {
			return (regularPrice+100)*0.9;
		}
		return (regularPrice+100)*0.8;
	}
}
