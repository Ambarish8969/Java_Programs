package com.jsp.Arrays;

// Check sum is Prime or Not.
public class Arrays3 {
	public static boolean isPrime(int n) {
		int count=0;
		for(int i=1;i<n;i++) {
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
		int arr[]= {10,55,49,50,61}; int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		System.out.println(isPrime(sum));
	}
}