package com.jsp.ArrayList1;
import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Object> a1=new ArrayList<Object>();
		a1.add(45);
		a1.add(100);
		a1.add("Ambarish");
		System.out.println(a1);
		System.out.println(a1.get(2));
		System.out.println(a1.size());
		a1.add(3, "Bhagawati");
		System.out.println(a1);
		a1.remove(3);
		System.out.println(a1);
		System.out.println(a1.contains(100));
		System.out.println(a1.containsAll(a1));
		System.out.println(a1.isEmpty());
	}
}
