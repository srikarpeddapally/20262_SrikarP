package com.sonata.Bank;

public class Bank {
	private int AccId;
	private String AccName;
	public double AccBal;

	
	public Bank(int accid, String accname, double accbal) {
		this.AccId=accid;
		this.AccName=accname;
		this.AccBal=accbal;
		
	}


	public int getAccId() {
		return AccId;
	}

	public void setAccId(int accId) {
		AccId = accId;
	}

	public String getAccName() {
		return AccName;
	}

	public void setAccName(String accName) {
		AccName = accName;
	}

	public double getAccBal() {
		return AccBal;
	}

	public void setAccBal(double accBal) {
		AccBal = accBal;
	}

	@Override
	public String toString() {
		return "Bank [AccId=" + AccId + ", AccName=" + AccName + ", AccBal=" + AccBal + "]";
	}
	

	
	

}
