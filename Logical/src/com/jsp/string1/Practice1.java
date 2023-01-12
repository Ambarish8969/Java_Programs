package com.jsp.string1;

public class Practice1 {

	public static void main(String[] args) {
		String name="ambarish";
		int length=0;
		for(int i=0;name.charAt(i)!='\0';i++) {
			length++;
		}
		System.out.println(length);
	}
}