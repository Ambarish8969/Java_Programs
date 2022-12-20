package com.jsp.Arrays;

// Sum of even elements.
public class Arrays2 {
	public static void main(String[] args) {
		int arr[]= {10,55,49,50,61};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	}

}
