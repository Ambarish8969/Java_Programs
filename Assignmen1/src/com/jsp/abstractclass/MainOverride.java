package com.jsp.abstractclass;
// for overriding :-
// method name should be same.
// arguments should be same.
// return type should be same.

class A{
	public void printA(int b){
		System.out.println("printing A");
	}
}
class B extends A{
	
	@Override // Annotation is optional. but we use for corrections.
	public void printA(int a) {
		super.printA(a);
		System.out.println("printing B");
	}
}
public class MainOverride {

	public static void main(String[] args) {
		B obj=new B();
		obj.printA(5);
	}
}