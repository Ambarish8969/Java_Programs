package com.jsp.Account;

public class Account {
	String accountHolderName;
	long accountNumber;
	private double bankBal;
	String branch;
	String ifsc;
	String bankName;
	
	public double getBankBal() {
		return bankBal;
	}
	public void setBankBal(double bankBal) {
		this.bankBal = bankBal;
	}
	
	public Account(String accountHolderName, long accountNumber, double bankBal, String branch, String ifsc,
			String bankName) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.bankBal = bankBal;
		this.branch = branch;
		this.ifsc = ifsc;
		this.bankName = bankName;
	}
	public void deposit(double amt) {
		bankBal=bankBal+amt;
		System.out.println(bankBal);
	}
	public void withdraw(double amt) {
		if(bankBal>amt) {
			bankBal=bankBal-amt;
			System.out.println(bankBal);
		}else {
			System.out.println("Invalid withdraw amount");
		}
	}
	public void checkBal() {
		System.out.println(bankBal);
	}
	
}
