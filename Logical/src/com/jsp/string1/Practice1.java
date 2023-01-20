package com.jsp.string1;

public class Practice1 {
	public static void main(String[] args) {
		String name="ambarish";
		String s2="";
		for(int i=0;i<name.length();i++) {
			s2=name.charAt(i)+s2;
		}
		System.out.println(s2); 
		
	}
}