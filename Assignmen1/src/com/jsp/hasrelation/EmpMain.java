package com.jsp.hasrelation;

class Address{
	long account;
	int pin;
	String city;
	
	public Address(long account, int pin, String city) {
		super();
		this.account = account;
		this.pin = pin;
		this.city = city;
	}	
}
class Employee{
	Address obj1;
	public void showDetails(Address obj1) {
		System.out.println("Account no : "+obj1.account);
		System.out.println("Pin : "+obj1.pin);
		System.out.println("City : "+obj1.city);
	}
}
public class EmpMain {
	public static void main(String[] args) {
		Employee e1=new Employee();
		Address obj1=new Address(46549884l,4568,"Benglore");
		e1.showDetails(obj1);
	}
}