package com.saturday.test2;

public class ThisStatement {
	
	public ThisStatement() {
		System.out.println("constructor 1");
	}
	public ThisStatement(int a) {
		this();
		System.out.println("constructor 2");
	}
	public ThisStatement(int a,int b) {
		this(5);
		System.out.println("constructor 3");
	}
	public ThisStatement(int c,double d) {
		this(5,8);
		System.out.println("constructor 4");
	}
	public ThisStatement(double e,int f) {
		this(6,2.8);
		System.out.println("constructor 5");
	}
	public static void main(String[] args) {
		ThisStatement obj=new ThisStatement(3.8,7);

	}

}
