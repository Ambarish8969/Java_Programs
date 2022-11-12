package com.saturday.test2;

public class Numbers {
	
	public void printNum(int n) {
		if(n>0) {
			printNum(n-1);
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		new Numbers().printNum(10);
	}

}