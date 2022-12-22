package com.jsp.Library;

public class String1 {

	public static void main(String[] args) {
		Practice p1=new Practice();
		Practice p2=new Practice();
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1); 
		System.out.println(p2); 
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p1.equals(p2)); 
		System.out.println("----Overriden methods of String class----");
		String s1="hello";
		String s2="Hello";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s1.equals(s2));
	}

}
