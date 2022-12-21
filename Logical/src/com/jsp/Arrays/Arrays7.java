package com.jsp.Arrays;

//To get max number present in an Array.
public class Arrays7 {
	public static void main(String[] args) {
		int arr[]= {10,6,17,18,8};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		} 
		System.out.println(max);
	}
}