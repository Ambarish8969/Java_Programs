package com.jsp.logical1;

public class Fibonacci {

	public static void main(String[] args) {
		int n1=0,n2=1,sum=0,i=1;
		while(i<=10) {
			System.out.println(n1);
			sum=n1+n2;
			n1=n2;
			n2=sum;
			i++;
		}
	}

}
