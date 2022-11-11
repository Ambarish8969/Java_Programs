package com.jsp.assign1;

public class NosStaticBlock {
	{
		System.out.println("non static block");
	}
	public void NosStaticBlock1() {
		System.out.println("method1");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		new NosStaticBlock().NosStaticBlock1();
	}
}