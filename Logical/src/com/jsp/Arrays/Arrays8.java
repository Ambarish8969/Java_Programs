package com.jsp.Arrays;

// To get minimum number present in an Array.
public class Arrays8 {
	public static void main(String[] args) {
		int arr[]= {10,6,17,18,8};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		} 
		System.out.println(min);
	}

}
