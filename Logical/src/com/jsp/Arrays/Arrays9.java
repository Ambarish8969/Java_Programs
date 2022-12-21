package com.jsp.Arrays;

//To find sum of max and min is Prime or not.
public class Arrays9 {
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
		int arr[]= {10,6,17,18,8};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i]; 
			}
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(isPrime(max+min));
		
	}

}
