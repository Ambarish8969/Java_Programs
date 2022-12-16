package com.jsp.logical1;

// Print 1 to 10 without using loops.

public class Recursion1 {
	public static void demo(int n) {
		if(n<=10) {
			System.out.println(n);
			n++;
			demo(n);
		}
	}
	public static void main(String[] args) {
		demo(1);
	}
}