package com.assignments.day2;
//Product Class
public class Assignment02 {
	int ProID;
	String ProName;
	float ProPrice;
	
	public void display() {
		System.out.println("Product Id = "+ ProID);
		System.out.println("Product Name = "+ ProName);
		System.out.println("ProPrice = "+ ProPrice*1.18);
	}

	public static void main(String[] args) {
		Assignment02 p1 = new Assignment02();
		p1.ProID=1;
		p1.ProName="apple";
		p1.ProPrice=80000;
		p1.display();

	}

}
