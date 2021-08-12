package com.sonata.Day03Assignment;

public class Manager extends Employee{
	
	public int salCal()
	{
		return (getEmpSal()*1000);
	
	}
}
//changed from void salCal to int for custom exception probem(Q no.3)