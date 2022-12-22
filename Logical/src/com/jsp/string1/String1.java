package com.jsp.string1;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		char c=ip.next().charAt(0);
		if((c>'a' && c<'z') || (c>'A' && c<'Z')) {
			System.out.println("Alphabet");
		}else if(c>'0' && c<'9') {
			System.out.println("Numeric");
		}else {
			System.out.println("Special Char");
		}
	}

}
