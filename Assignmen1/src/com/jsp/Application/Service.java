package com.jsp.Application;

public class Service {
	Account a1;
	public Account creatObject(int pin) {
		if(pin==1234) {
			Account a1=new Atm(14378411789l,20000.0,"Namrata","ICIC786");
			return a1;
		}else {
			Account a2=new Web(4567841164l,10000.0,"Ambarish","ICIC908");
			return a2;
		}
	}
}
