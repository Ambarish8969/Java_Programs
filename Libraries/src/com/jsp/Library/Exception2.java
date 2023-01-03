package com.jsp.Library;

class Car extends Exception{
	public Car(String message) {
		super(message);
	}
	public void checked() throws Car{
		throw new Car("wasted");
	}
}
public class Exception2 {
	public static void main(String[] args) {
		Car c1=new Car("a");
		try {
			c1.checked();
		}
		catch(Car e) {
			e.printStackTrace();
		}
	}
}