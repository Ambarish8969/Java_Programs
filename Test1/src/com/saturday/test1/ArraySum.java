package com.saturday.test1;

public class ArraySum {

	public static void main(String[] args) {
		int[] arr= {1,10,8,2};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);  // Printing sum of elements present in Array.
	}
}
