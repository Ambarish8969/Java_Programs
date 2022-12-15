package com.jsp.Debitcard;

import com.jsp.Account.*;

public class DebitCard {
	int pinNumber;
	int cvv;
	String expDate;
	Account a1;
	
	public DebitCard(int pinNumber, int cvv, String expDate, Account a1) {
		super();
		this.pinNumber = pinNumber;
		this.cvv = cvv;
		this.expDate = expDate;
		this.a1 = a1;
	}
	public DebitCard() {
		
	}

	public void generatePin(int pinNumber) {
		this.pinNumber=pinNumber;
	}
	public void updateDetails(int cvv,String expDate) {
		this.cvv=cvv;
		this.expDate=expDate;
	}
	public void onlinePayment(double productAmt) {
		if(a1.getBankBal()>productAmt) {
			a1.setBankBal(a1.getBankBal()-productAmt);
			System.out.println("Payment Successfull");
		}else {
			System.out.println("Insufficient Balance");
		}
	}
}
