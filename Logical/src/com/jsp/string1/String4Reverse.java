package com.jsp.string1;

// String Reverse.
public class String4Reverse {

	public static void main(String[] args) {
		String name="ambarish";
		String name1="";
		String name2="";
		for(int i=0;i<name.length();i++) {
			name1=name.charAt(i)+name1;
		}
		for(int i=name.length()-1;i>=0;i--) {
			name2=name2+name.charAt(i);
		}
		System.out.println(name1);
		System.out.println(name2);
	}
}