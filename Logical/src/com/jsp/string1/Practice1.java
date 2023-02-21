package com.jsp.string1;

class A{
	public void transaction() {
		System.out.println("transaction 1");
	}
}
class B extends A{
	
//	public void ambi() {
//		System.out.println("ambi");
//	}
	public void transactionfrf5() { 
		System.out.println("transaction 2");
	} 
}
class C extends A{
	
	public void transaction() {
		System.out.println("transaction 3");
	}
}
class Service{
	A a;
	public A createObject(int s) {
		if(s==1234) {
			a=new B()0;
			return a; 
		}else {
			a=new C();
			return a;
		}
	}
}
public class Practice1 {
	public static void main(String[] args) {
		Service s1=new Service();
		System.out.println(s1.createObject(7595));
		A a1=s1.createObject(1234);
		a1.transaction();
		
		A a2=new B();
		a2.transaction();
//		a2.ambi();
	}
}