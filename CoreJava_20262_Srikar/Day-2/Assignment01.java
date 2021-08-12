package com.assignments.day2;
//Student Class
public class Assignment01 {
	int stdID;
	String stdName;
	int stdClass;
	
	public void display() {
		System.out.println("Student Id = " + stdID);
		System.out.println("Student Name is "+stdName);
		System.out.println("Sandard "+ stdClass);
		System.out.println();
	}

	public static void main(String[] args) {
		Assignment01 s1 = new Assignment01();
		s1.stdID=1;
		s1.stdName="srikar";
		s1.stdClass=10;
		Assignment01 s2 = new Assignment01();
		s2.stdID=2;
		s2.stdName="sai";
		s2.stdClass=12;
		s1.display();
		s2.display();

	}

}
