package com.jsp.logical1;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=ip.nextInt();
		int sum=0;
		int[] arr=new int[size];
		for (int i=0 ; i<arr.length;i++) {
			arr[i]=ip.nextInt();
		}
		// reverse print of arr
		System.out.println("reverse order");
		for (int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
		
		// sum of array
		for (int i=arr.length-1; i>=0; i--) {
			if(arr[i]%2==0)
			sum=sum+arr[i];
		}
		System.out.println("sum:"+sum);

	}
}
