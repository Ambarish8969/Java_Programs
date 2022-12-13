package com.jsp.Application;

public class Atm extends Account implements User {
	double bal;
	@Override
	public void transaction(double amt,int choice) {
		if(choice==1) {
			deposit(amt);
		}else {
			withdraw(amt);
		}
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