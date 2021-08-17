package com.sonata.Bank;

public class CurrentAccount extends Bank implements BankInterface{

	public CurrentAccount(int accid, String accname, double accbal) {
		super(accid, accname, accbal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double d) {
		AccBal=AccBal+d;
		System.out.println(AccBal);
	}

	@Override
	public double withdraw(double d) {
		if(d<100000)
			AccBal=AccBal-d;
			return getAccBal()-d;
			
			
	}
	
	public static void main(String[] args) {
		CurrentAccount c1 = new CurrentAccount(1,"srikar",3000);
		c1.withdraw(100);
		System.out.println(c1.AccBal);
	}
	

}
