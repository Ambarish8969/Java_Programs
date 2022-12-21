package com.jsp.Arrays;

public class Arrays12 {

	public static void main(String[] args) {
		int arr[]= {2,1,4,5,12};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		} 
		int sum=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=max) {
				sum=sum+arr[i]; 
			}
		}
//		System.out.println(max);
//		System.out.println(sum);
		if(sum==max) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}