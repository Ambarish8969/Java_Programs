package com.jsp.string1;

import java.util.Scanner;

// Convert lowercase to uppercase (which are lowercase) and 
// Convert uppercase to lowercase (which are uppercase) in Given String.
// Ex : i/p -> Hi12@Hello Bye #
// 		o/p -> hI12@hELLO bYE #
public class String7Conversion {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		String s2="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a' && c<='z') {
				c-=32;
				s2=s2+c;
			}else if(c>='A' && c<='Z') {
				c+=32;
				s2=s2+c;
			}else {
				s2=s2+c;
			}
		}
		System.out.println(s2);
	}

}