package com.sonata.Day03Assignment;

public  class Address extends EmployeesTS {
	private int DoorNo;
	private String Street;
	private String City;
	private int Pincode; 
	
	public Address(int empid, String empname, Address obj, double BasicPay, int NoOfLeavesAvailbale) {
		super(empid, empname, obj, BasicPay, NoOfLeavesAvailbale);
		
	}
	Address(int doorno, String street, String city, int pincode){
		this.DoorNo=doorno;
		this.Street=street;
		this.City=city;
		this.Pincode=pincode;
	}
	

	

	@Override
	public void salCal() {
		// TODO Auto-generated method stub
		
	}

	
	
}
