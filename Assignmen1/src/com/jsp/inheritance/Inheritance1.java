package com.jsp.inheritance;

class Demo1{
	static int a=10;
	public void method1() {
		a=30;
		System.out.println(a);
		System.out.println("method1");
		System.out.println(a);
	}
}
public class Inheritance1 extends Demo{
	
	public void bike() {
		System.out.println("bike");
	}
	public static void main(String[] args) {
		Demo1 obj=new Demo1();
		obj.method1();
		Inheritance1 obj2=new Inheritance1();
		obj2.bike();
	}
}
