package com.jsp.hasrelation;

public class Account {
	long accno;
	double bal;
	String ifsc;
	String branch;
	
	public Account(long accno, String ifsc, String branch) {
		super();
		this.accno = accno;
		//this.bal = bal;
		this.ifsc = ifsc;
		this.branch = branch;
	}
	public void deposit(double amt) {
		bal=bal+amt;
		System.out.println(bal);
	}
	public void withdraw(double amt) {
		if(bal>amt) {
			bal=bal-amt;
			System.out.println(bal);
		}
	}
}
