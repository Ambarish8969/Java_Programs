package com.jsp.Application;

public class Atm implements Account {
	double bal;
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
}