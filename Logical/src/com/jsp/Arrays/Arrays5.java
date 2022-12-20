package com.jsp.Arrays;

// To get the sum of Fibonacci numbers present in the Array.
public class Arrays5 {
	public static boolean isFibonacci(int n) {
		int n1=0,n2=1,n3=0,i=0;
		while(i<n) {
			n3=n1+n2; 
			n1=n2;
			n2=n3; 
			i++;
		}
		if(n3==n) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		int arr[]= {4,6,1,3,2,10,34};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(isFibonacci(arr[i])==true) {
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	}
}