<<<<<<< HEAD
package com.sonata.Bank;

public class JointAccount extends Bank implements BankInterface {

	public JointAccount(int accid, String accname, double accbal) {
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
		AccBal=AccBal-d;
		return getAccBal()-d;
	}
	
	public static void main(String[] args) {
		JointAccount j1= new JointAccount(1,"srikar",1000);
		j1.withdraw(200);
		System.out.println(j1.AccBal);
	}

}
=======
package com.sonata.Bank;

public class JointAccount extends Bank implements BankInterface {

	public JointAccount(int accid, String accname, double accbal) {
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
		AccBal=AccBal-d;
		return getAccBal()-d;
	}
	
	public static void main(String[] args) {
		JointAccount j1= new JointAccount(1,"srikar",1000);
		j1.withdraw(200);
		System.out.println(j1.AccBal);
	}

}
>>>>>>> refs/remotes/origin/master
