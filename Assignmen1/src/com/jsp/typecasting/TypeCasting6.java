package com.jsp.typecasting;

interface User1{
	public void transaction();
}
class Atm implements User1{
	public void transaction() {
		System.out.println("transaction of ATM");
	}
}
class Web implements User1{
	public void transaction() {
		System.out.println("transaction of Web");
	}
} 
class Service{
	//User1 u1; 
	public User1 createobject(int pin) {
		if(pin ==1234) {
		//	u1=new Atm();
			Atm a1=new Atm();
		//	a1.transaction();
			return a1;
		}else {
		//	u1=new Web();
			Web w1=new Web();
		//	w1.transaction();
			return w1;
		}
	}
}
public class TypeCasting6 {
	public static void main(String[] args) {
		Service s1=new Service();
//		User1 u1=s1.createobject(1234);
//		u1.transaction();
//		
//		User1 u2=s1.createobject(4565);
//		u2.transaction();
		
		Atm a1=new Atm();
		a1.transaction();
		
		Web w1=new Web();
		w1.transaction();
	}
}