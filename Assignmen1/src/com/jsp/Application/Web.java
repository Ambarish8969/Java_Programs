package com.jsp.Application;

public class Web implements Account {
//	double bal;
	long accno;
	double bal=5000;
	String owner;
	String ifsc;
	static String bankname="ICICI";
	
	public Web(long accno,String owner,String ifsc) {
		this.accno=accno;
		//this.bal=bal;
		this.owner=owner;
		this.ifsc=ifsc;
	}
	@Override
	public void deposit(double amt) {
		System.out.println("Using Web");
		bal=bal+amt;
		System.out.println("current bal : "+bal+", deposit amt : "+amt);
	}
	@Override
	public void withdraw(double amt) {
		System.out.println("Using Web");
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
