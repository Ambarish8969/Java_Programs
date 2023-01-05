package com.jsp.Arrays;

public class Arrays14 {
	public static void main(String[] args) {
		int arr1[]= {10,30,2,4,10,30};
		int sum=0;
		for(int i=0;i<arr1.length;i++) {
			int c=0;
			for(int j=0;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					c++;
				}
			}
			if(c==1) {
				sum=sum+arr1[i];
			}
		}
		System.out.println(sum);
	}
}