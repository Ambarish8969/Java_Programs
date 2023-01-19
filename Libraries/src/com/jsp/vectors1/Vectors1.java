package com.jsp.vectors1;

import java.util.Vector;

public class Vectors1 {
	public static void main(String[] args) {
		Vector<Object> v1=new Vector<Object>();
		v1.add(45);
		v1.add(7898);
		v1.add("Ambika");
		v1.add('a');
		System.out.println(v1);
		System.out.println(v1.size());// number of elements present in Vector.
		System.out.println(v1.capacity()); // number of elements can be stored in Vector.
	}
}
