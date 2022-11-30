package com.jsp.typecasting;

public class TypeCasting3 {
	// Type Casting.Widening and Narrowing
	public static void test(long a) {
		System.out.println(a);
	}
	public static void test2(int b) {
		System.out.println(b);
	}
	public static void test3(double c) {
		System.out.println(c);
	}
	public static void test4(int d) {
		System.out.println(d);
	}
	public static void main(String[] args) {
		// Widening -> Low data type to High data type
		byte a=1;
		test(a);
		// Narowing -> High data type to low data type
		long b=46;
		test2((int)b);
		// Widening -> Low data type to High data type
		int c=34;
		test3(c);
		// Narowing -> High data type to low data type
		float d=3.4f;
		test4((int)d);
	}
}
