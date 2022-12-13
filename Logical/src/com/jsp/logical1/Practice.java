package com.jsp.logical1;
class A{
	public static void main(String[] args) {
		System.out.println("Main 1");
	}
}
public class Practice {
	
	public static void main(String[] args) {
		System.out.println("Main 2");
		A.main(args);
	}
}