package com.jsp.HashSet1;

import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet<Object> h1=new HashSet<Object>();
		h1.add(1);
		h1.add(56);
		h1.add(48);
		System.out.println(h1);
		for(Object o:h1) {
			System.out.println(o);
		}
	}
}