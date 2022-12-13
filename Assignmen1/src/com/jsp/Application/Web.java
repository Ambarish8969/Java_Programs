package com.jsp.Application;

public class Web extends Account implements User {
	double bal;
	@Override
	public void transaction(double amt,int choice) {
		if(choice==1) {
			send(amt);
		}else {
			receive(amt);
		}
	}
	public void send(double amt) {
		if(bal>=amt) {
			bal=bal-amt;
			System.out.println("current bal : "+bal+", send amt : "+amt);
		}else {
			System.out.println("Invalid Transaction.");
		}
	}
	public void receive(double amt) {
		bal=bal+amt;
		System.out.println("current bal : "+bal+", received amt : "+amt);
	}
	
}
