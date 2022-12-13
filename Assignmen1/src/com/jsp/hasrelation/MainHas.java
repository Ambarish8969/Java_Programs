package com.jsp.hasrelation;

public class MainHas {

	public static void main(String[] args) {
		Account a1=new Account(4648651614l,"icici012","Banglore");
		Customer c1=new Customer("Ambarish",9900408969l,a1);
		c1.deposit_to_account(10000);
		c1.withdraw_from_account(2000); 
	}

}
