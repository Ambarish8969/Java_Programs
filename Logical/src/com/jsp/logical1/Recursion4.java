package com.jsp.logical1;

// Factorial of a Number using recursion.

public class Recursion4 {
	public static int fact(int n) {
		if(n==1) {
			return 1; 
		}else { 
			return n*fact(n-1);
		} 
	}
	public static void main(String[] args) {
		System.out.println(fact(6));
	}
}