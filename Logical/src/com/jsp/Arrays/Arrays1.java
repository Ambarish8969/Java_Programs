package com.jsp.Arrays;

import java.util.Scanner;

// Taking input from the User.
public class Arrays1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int arr[]=new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		input.close();
	}

}
