package com.jsp.hasrelation;

public class Customer {
	String name;
	long mobile;
	Account a1;
	public Customer(String name, long mobile, Account a1) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.a1 = a1;
	}
	public void deposit_to_account(double amt) {
		a1.deposit(amt);
	}
	public void withdraw_from_account(double amt) {
		a1.withdraw(amt);
	}
	public void showDetails() {
		
	}
}
