package com.jsp.Application;

public class Service {
	Account a1;
	public Account creatObject(int pin) {
		if(pin==1234) {
			Account a1=new Atm();
			return a1;
		}else {
			Account a2=new Web();
			return a2;
		}
	}
}
