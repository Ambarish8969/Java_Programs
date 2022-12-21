package com.jsp.Arrays;

// To replace the element with largest element towards its 
// left side otherwise replace with -1.
public class Arrays11 {

	public static void main(String[] args) {
		int arr[]= {45,7,88,9,12,99};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max>arr[i]) {
				arr[i]=max;
			}else {
				max=arr[i];
				arr[i]=-1;
			}
		}
		arr[0]=-1;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
