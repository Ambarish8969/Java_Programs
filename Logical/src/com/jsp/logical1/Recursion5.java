package com.jsp.logical1;

// Print nth fibonacci number using recursion.

public class Recursion5 {
	public static int fibonacci(int n) {
		if(n<=1) { 
			return n;
		}return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void main(String[] args) {
		System.out.println(fibonacci(4));
	}
}