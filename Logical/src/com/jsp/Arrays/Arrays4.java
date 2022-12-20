package com.jsp.Arrays;

// To get Sum of Prime numbers present in the array.
public class Arrays4 {
	public static boolean isPrime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true; 
		}else { 
			return false;
		}
	}
	public static void main(String[] args) {
		int arr[]= {2,3,50,20,5,12,18};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])==true) {
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	}
}