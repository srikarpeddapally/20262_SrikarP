package com.sonata.Bank;

public class SavingAccount extends Bank implements BankInterface {

	public SavingAccount(int accid, String accname, double accbal) {
		super(accid, accname, accbal);
		
	}

	@Override
	public void deposit(double d) {
		AccBal=AccBal+d;
		System.out.println();
			
	}

	@Override
	public double withdraw(double d) {
		
		if(d<25000 && d<getAccBal())
			return getAccBal()-d;
		else
			System.out.println("withdraw limit exceeded");
			return 0;
	}
	
}
