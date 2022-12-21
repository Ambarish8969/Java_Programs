package com.jsp.Arrays;

// To Replace each array elements with its sum of factors.
// Eg : Factors of 5 are 1 and 5, so 1+5=6.
// Here 5 is replaced by 6(sum of 5s factor).
public class Arrays6 {
	public static void main(String[] args) {
		int arr[]= {5,8,12,3,9};
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=1;j<=arr[i];j++) {
				if(arr[i]%j==0) {
					sum=sum+j;
				} 
			} 
			arr[i]=sum;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}