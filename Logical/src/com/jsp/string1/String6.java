package com.jsp.string1;

import java.util.Scanner;

// Sum of Integers present in a String.
public class String6 {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='0' && c<='9') {
				sum=sum+(c-48);
			}
		}
		System.out.println(sum);
	}

}
