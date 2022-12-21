package com.jsp.Library;

public class Assignment1 {
	
	public int hashCode() {
		return 990040;
	}
	public String toString() {
		return "ambi";
	}
	public boolean equals(Object obj) {
		return true;
	} 

	public static void main(String[] args) {
		Assignment1 a1=new Assignment1();
		Assignment1 a2=new Assignment1();
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a1));
	} 
} 