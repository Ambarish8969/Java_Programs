package com.jsp.abstraction;

// Golden Rule of Java.
class Super{
	public void test1() {
		System.out.println("Hii");
	}
}
public class Abstraction1 extends Super {
	@Override
	public void test1() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Super s1=new Abstraction1();
		s1.test1();
	}
}