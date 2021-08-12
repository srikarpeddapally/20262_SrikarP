package com.sonata.Day03Assignment;

public class TechnicalEmployee extends EmployeesTS {
	String Skill;
	
	public TechnicalEmployee(int empid, String empname, Address obj, double BasicPay, int NoOfLeavesAvailbale) {
		super(empid, empname, obj, BasicPay, NoOfLeavesAvailbale);

	}

	TechnicalEmployee(String skill){
		this.Skill=skill;
	}
	
	


	
	@Override
	public String toString() {
		return "EmployeesTS [empID=" + getEmpID() + ", empName=" + getEmpName() + "]";
	}

	public void salCal()
	{
		double sal= BasicPay + BasicPay*0.12;
		System.out.println("Salary is "+ sal);
	}
}
