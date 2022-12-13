package com.jsp.Application;

public class Account {
	long accno;
	double bal=10000;
	String owner;
	String ifsc;
	static String bankname="ICICI";
//	public Atm() {
//		
//	}
	
	public Atm(long accno,String owner,String ifsc) {
		this.accno=accno;
//		this.bal=bal;
		this.owner=owner;
		this.ifsc=ifsc;
	}
	
	public void deposit(double amt) {
		bal=bal+amt;
		System.out.println("current bal : "+bal+", deposit amt : "+amt);
	}
	
	public void withdraw(double amt) {
		if(bal>=amt) {
			bal=bal-amt;
			System.out.println("current bal : "+bal+", withdraw amt : "+amt);
		}else {
			System.out.println("Invalid Transaction.");
		}
	}
	
}
