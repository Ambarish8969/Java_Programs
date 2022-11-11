package com.jsp.inheritance;
class Sample{
	final int a=10;
	String sub="java";
	public final void bike1() {
		System.out.println("bike");
	}
	public void car() {
		System.out.println("car");
	}
}
class Demo extends Sample{
	public void cycle() {
		System.out.println("cycle");
	}
}
public class Inheritance3 {

	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.bike1();
		obj.car();
		obj.cycle();
		System.out.println(obj.a);
		System.out.println(obj.sub);
	}

}
