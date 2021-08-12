package com.sonata.Day03Assignment;

public class Employee {
	private int empId;
	private String empName;
	private int empSal;

	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
//	changed from void salCal to int for custom exception probem(Q no.3)
	public int salCal() {
		return 0;
	}
	
	public void display() {
		System.out.println("Id = " + empId);
		System.out.println("Name = "+ empName);
		System.out.println("Salary = " + empSal);
	}
	

}
