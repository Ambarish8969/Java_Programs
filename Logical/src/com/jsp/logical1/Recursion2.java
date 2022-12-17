package com.jsp.logical1;

// Print 1 to 10 in reverse order without using loops.

public class Recursion2 {
	public static void demo(int n) {
		if(n>=1) { 
			System.out.println(n);
			n--;
			demo(n);
		}
	}
	public static void main(String[] args) {
		demo(10);
	}

}
