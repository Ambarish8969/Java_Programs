package com.jsp.Application;

public class Service {
	Account a1;
	public Account creatObject(int pin,int choice) {
		if(pin==1234) {
			Account a1=new Atm(14378411789l,"Namrata","ICIC786");
			if(choice ==1) {
				
				a1.deposit(10000);
			}else {
				
				a1.withdraw(2000);
			}
			return a1;
		}else {
			Account a2=new Web(4567841164l,"Ambarish","ICIC908");
			if(choice ==1) {
				
				a1.deposit(5000);
			}else {
				
				a1.withdraw(2000);
			}
			return a2;
		}
	}
}
