package com.jsp.vectors;

import java.util.ArrayList;
import java.util.Vector;

public class Vectors1 {
	public static void main(String[] args) {
		// <Integer> and <Object> these are called as Generics used for type saftey.
		ArrayList<Integer> a=new ArrayList<Integer>();
		Vector<Object> v=new Vector<Object>();
		// The Default size(capacity) of a vector is 10
		// when capacity increased by one then capacity will be 
		// double of the current capacity(CC).i.e -->10*2=20   (100% of CC)
		// where ArrayList increase the size by 50%
		System.out.println(v.capacity());
		System.out.println(v.getClass().getName());
	}
}
