package com.jsp.assign1;

public class ConstructorOverloading { 
	
	public ConstructorOverloading() {
		System.out.println("constructor 1");
	}
	public ConstructorOverloading(int a) {
		this();
		System.out.println("constructor 2");
	}
	public ConstructorOverloading(int a,double b) {
		this();
		System.out.println("constructor 3");
	}
	public ConstructorOverloading(double a, int b) {
		this();
		System.out.println("constructor 4");
	}
	public ConstructorOverloading(int a, int b, int c) {
		this(8.1,5);
		System.out.println("constructor 5");
	}
	
	public static void main(String[] args) {
		ConstructorOverloading obj=new ConstructorOverloading(5,6,8);
		
	}
}
