package com.jsp.interface1;

interface A{
	public void add();
}
interface B{
	public void test();
}
class C{
	public void print() {
		System.out.println("print in D");
	}
}
class D extends C implements A,B{
	public void add() {
		System.out.println("add in D");
	}
	public void test() {
		System.out.println("test in D");
	}
}
public class Interface11 {

	public static void main(String[] args) {
		D obj=new D();
		obj.add();
		obj.test();
		obj.print();
	}
}