package com.sonata.Day03Assignment;

public class TestEmployeesTS{

	public static void main(String[] args) {
	Address a1 = new Address(1,"sai","hyd",50098);
		a1.setObj(a1);
		Address a2 = new Address(2,"peer","wgl",500039);
		a2.setObj(a2);
		TechnicalEmployee te1 = new TechnicalEmployee(12, "srikar", a1, 20000, 0);
		System.out.println(te1);
		Staff s1 = new Staff(13,"we",a2,15000,10);
		s1.setObj(a2);
		s1.setTitle("security");
		System.out.println(s1);
	}
}
