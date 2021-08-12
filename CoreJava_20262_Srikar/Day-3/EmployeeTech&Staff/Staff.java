package com.sonata.Day03Assignment;

public class Staff extends EmployeesTS {
	private String Title;
	
	public Staff(int empid, String empname, Address obj, double BasicPay, int NoOfLeavesAvailbale) {
		super(empid, empname, obj, BasicPay, NoOfLeavesAvailbale);
		
	}

	public String getTitle() {
		return Title;
	}

	@Override
	public String toString() {
		return "Staff [EmpID = " + getEmpID() + " EmpName = " + getEmpName() + " Title = " + Title +  "]";
	}

	public void setTitle(String title) {
		Title = title;
	}
	
	public void salCal()
	{
		double sal= BasicPay+BasicPay*0.18;
		System.out.println("Salary is "+ sal);
	}
}
