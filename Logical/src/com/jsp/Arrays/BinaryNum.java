package com.jsp.Arrays;

import java.util.Scanner;

public class BinaryNum {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int rem=0;
		int arr[]= new int[40];
		int i=0;
		while(n>0){
			rem=n%2;
			arr[i++]=rem;
			n=n/2;  
		}
		 for(int j=i-1;j>=0;j--) {
			 System.out.print(arr[j]+"");
		 }
	}
}