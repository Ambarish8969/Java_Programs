package com.jsp.Library;

public class Practice {
	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		String s4=new String("hello");
		System.out.println(s1==s2); // True
		System.out.println(s3==s4); // False
		System.out.println(s1==s3); // False
		System.out.println("---------------------------");
		System.out.println(s1.equals(s2)); // True
		System.out.println(s3.equals(s4)); // True
		System.out.println(s1.equals(s3)); // True
	}
}