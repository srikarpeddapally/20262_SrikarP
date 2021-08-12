package com.sonata.Day03Assignment;

public abstract class EmployeesTS {
	private int empID;
	private String empName;
	private Address obj;
	protected double BasicPay;
	private int NoOfLeavesAvailble;
	
	EmployeesTS(int empid, String empname, Address obj, double basicpay, int leaves) {
		this.empID=empid;
		this.empName=empname;
		this.obj=obj;
		this.BasicPay=basicpay;
		this.NoOfLeavesAvailble=leaves;
	}
	
	EmployeesTS(){
		
	}
	@Override
	public String toString() {
		return "EmployeesTS [empID=" + empID + ", empName=" + empName + "]";
	}
	
	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getObj() {
		return obj;
	}

	public void setObj(Address obj) {
		this.obj = obj;
	}

	public double getBasicPay() {
		return BasicPay;
	}

	public void setBasicPay(double basicPay) {
		BasicPay = basicPay;
	}

	public int getNoOfLeavesAvailble() {
		return NoOfLeavesAvailble;
	}

	public void setNoOfLeavesAvailble(int noOfLeavesAvailble) {
		NoOfLeavesAvailble = noOfLeavesAvailble;
	}

	public abstract void salCal();
	
	
}
