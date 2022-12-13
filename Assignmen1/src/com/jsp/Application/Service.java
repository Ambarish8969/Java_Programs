package com.jsp.Application;

public class Service {
	User a1;
	public User creatObject(int pin,int choice) {
		if(pin==1234) {
			User a1=new Atm();
			if(choice ==1) {
				deposit(10000);
			}else {
				
				withdraw(2000.0);
			}
			return a1;
		}else {
			User a2=new Web();
			if(choice ==1) {
				
				send(5000);
			}else {
				
				receive(2000);
			}
			return a2;
		}
	}
	private void receive(int i) {
		// TODO Auto-generated method stub
		
	}
	private void send(int i) {
		// TODO Auto-generated method stub
		
	}
	private void withdraw(double d) {
		// TODO Auto-generated method stub
		
	}
	private void deposit(int i) {
		// TODO Auto-generated method stub
		
	}
}
