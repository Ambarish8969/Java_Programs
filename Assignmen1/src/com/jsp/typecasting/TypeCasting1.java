package com.jsp.typecasting;

class A{
	public void test1() {
		System.out.println("Test 1");
	}
}
class B extends A{
	public void test2() {
		System.out.println("Test 2");
	}
}
class C extends A{
	public void test3() {
		System.out.println("Test 3");
	}
}
public class TypeCasting1 {

	public static void main(String[] args) {
		B obj1=new B();
		A obj2=obj1;
		obj2.test1();
//		obj2.test2();
		
		B obj3=(B)obj2;
		obj3.test1();
		obj3.test2();
		
		C obj4=(C)obj2;
	}
}