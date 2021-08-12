package com.assignments.day2;

public class MyOwnAutoShop extends Car {
	MyOwnAutoShop(int s, double p, String c){
		super(s,p,c);
	}

	public static void main(String[] args) {
		Sedan s1 = new Sedan(20, 100, "blue");
		s1.length=21;
		System.out.println("Sale Price for Sedan "+ s1.getSalePrice());
		Ford f1 = new Ford(100,1000,"red");
		f1.manufacturerDiscount=200;
		System.out.println("Sale Price for Ford "+ f1.getSalePrice());
		Ford f2 = new Ford(200,2000,"silver");
		f2.manufacturerDiscount=200;
		System.out.println("Sale Price for ford-2 is "+ f2.getSalePrice());
		Car c1 = new Car(90,9000,"yellow");
		System.out.println("Sale Price of Car is "+ c1.getSalePrice());
		
	}

}
