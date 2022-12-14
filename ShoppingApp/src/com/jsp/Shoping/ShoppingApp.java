package com.jsp.Shoping;
import com.jsp.Account.Account;
import com.jsp.Debitcard.*;
public class ShoppingApp extends DebitCard {
	String productName;
	double productPrice;
	String shippingaddress;
	
	public ShoppingApp(int pinNumber, int cvv, String expDate, Account a1, String productName, double productPrice,
			String shippingaddress) {
		super(pinNumber, cvv, expDate, a1);
		this.productName = productName;
		this.productPrice = productPrice;
		this.shippingaddress = shippingaddress;
	}

//	public ShoppingApp(int pinNumber, int cvv, String expDate, Account a1) {
//		super(pinNumber, cvv, expDate, a1);
//		
//	}
	
	public void selectProduct(String productName,double productPrice,String shippingaddress) {
		System.out.println("product selected buy now");
	}
}