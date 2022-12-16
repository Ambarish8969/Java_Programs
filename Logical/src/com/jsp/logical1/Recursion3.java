package com.jsp.logical1;

// Print sum of n numbers using recursion.
public class Recursion3 {
	public static int demo(int n) {
		if(n==0) {
			return 0;
		}else {
			return n+demo(n-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(demo(10));
	}
}