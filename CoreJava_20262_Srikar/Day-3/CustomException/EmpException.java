package com.sonata.Day03Assignment;

public class EmpException {
	public static void main(String[] args) throws MyOwnException{
		Tester t1 = new Tester();
		t1.setEmpSal(1000);
		int sal= (t1.salcal())*12;
		if(sal<100000)
			throw new MyOwnException("sal not cerdited");
		else
			System.out.println("salary credited");
			
	}
	

}
