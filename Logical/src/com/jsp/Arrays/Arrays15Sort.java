package com.jsp.Arrays;

public class Arrays15Sort {
	public static void main(String[] args) {
		int arr[]= {5,3,2,4,1};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
//		System.out.println();
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
	}
}
