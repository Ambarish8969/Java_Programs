package com.saturday.test1;

public class Variables {
	
	int a=10;		// global variable
	int b=20;		// global variable
	int result=a+b;	// global variable
	
	public void add() {
		int a=50;		// local variable
		int b=20;		// local variable
		int result=a+b;	// local variable
		System.out.println(result);
	}

	public static void main(String[] args) {
		new Variables().add();						// Printing of local variable result.
		System.out.println(new Variables().result); // Printing of global variable result.
	}

}
