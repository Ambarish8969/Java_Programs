package com.jsp.Arrays;

// Sum of Duplicate item.
public class Arrays13 {
	public static void main(String[] args) {
		int arr1[]= {10,30,2,4,10,30};
		int arr2[]= new int[5];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					arr2[i]=arr1[i];
				}
			}
		}
		int sum=0;
		for(int i=0;i<arr2.length;i++) {
			sum=sum+arr2[i];
		}
		System.out.println(sum);
	}
}