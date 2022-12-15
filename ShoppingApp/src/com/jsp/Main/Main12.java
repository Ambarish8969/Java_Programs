package com.jsp.Main;

import com.jsp.Account.Account;
import com.jsp.Debitcard.DebitCard;
import com.jsp.Shoping.ShoppingApp;

public class Main12 {
	public static void main(String[] args) {
		Account a1=new Account("Ambi",4541546566l,45446,"Benglore","icici456","ICICI");
		DebitCard d1=new DebitCard(1245,456,"01-01-01",a1);
		ShoppingApp s1=new ShoppingApp("Mobile",1500,"Belagavi");
		a1.deposit(100000);
		s1.generatePin(7896);
		s1.updateDetails(123, "13-01-2000");
		s1.selectProduct("Laptop", 50000, "Chikodi");
		s1.onlinePayment(2000);
	}
}