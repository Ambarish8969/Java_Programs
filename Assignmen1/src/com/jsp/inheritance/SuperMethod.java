package com.jsp.inheritance;
class SuperClass{
	public SuperClass() {
		System.out.println("super");
	}
	public SuperClass(int b) {
		this();
		System.out.println("int b");
	}
}
class SubClass extends SuperClass{
	public SubClass() {
		super(); // new SuperClass();
		System.out.println("sub");
	}
	public SubClass(int a) {
		super(10);
		System.out.println("int a");
	}
}
public class SuperMethod {
	public static void main(String[] args) {
//		new SubClass();
		new SubClass(9);
	}
}