package com.jsp.Application;

public class Atm implements Account {
	long accno;
	double bal;
	String owner;
	String ifsc;
	static String bankname="ICICI";
	
	public Atm(long accno,double bal,String owner,String ifsc) {
		this.accno=accno;
		this.bal=bal;
		this.owner=owner;
		this.ifsc=ifsc;
	}
	@Override
	public void deposit(double amt) {
		System.out.println("Using Atm");
		bal=bal+amt;
		System.out.println("current bal : "+bal+", deposit amt : "+amt);
	}
	@Override
	public void withdraw(double amt) {
		System.out.println("Using Atm");
		if(bal>=amt) {
			bal=bal-amt;
			System.out.println("current bal : "+bal+", withdraw amt : "+amt);
		}else {
			System.out.println("Invalid Transaction.");
		}
	}
	@Override
	public void showDetails() {
		System.out.println(bankname);
		System.out.println(accno);
		System.out.println(bal);
		System.out.println(owner);
		System.out.println(ifsc);
	}
}