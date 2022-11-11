package com.jsp.inheritance;

class A{
	public void method1() {
		System.out.println("method1");
	}
}
class B extends A{
	public void method2() {
		System.out.println("method2");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		new B().method1();
	}

}
