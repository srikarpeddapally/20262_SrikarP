package com.assignments.day2;

public class Sedan extends Car{
	public Sedan(int s, double p, String c, int length) {
		super(s, p, c);
		// TODO Auto-generated constructor stub
	}
	int length;
	public double getSalePrice() {
		if(length>20) {
			return (regularPrice+100)*0.95;
		}
		return (regularPrice+100)*0.9;
	}
}
