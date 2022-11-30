package com.jsp.interface1;

interface Ab{
	// post JDK8 in interface
	// we can create not only abstract methods but also we can create concrete methods
	// using static and default(not-static) keywords
	public static void test() {
		System.out.println("Java");
	}
	public default void count() {
		System.out.println("Python");
	}
}
interface Ba{
	// post JDK8 in interface
	// we can create not only abstract methods but also we can create concrete methods
	// using static and default(not-static) keywords
	
//	@Override
//	public static void test() { (static methods can not be inherited)
//		System.out.println("Hii");
//	}
	
	public default void count() {
		System.out.println("Hello");
	}
}
class Ca implements Ab,Ba{
//	@Override
//	public void test() { (static methods can not be inherited)
//		System.out.println("implements test"); 
//	}
	@Override
	public void count() {
		System.out.println("implements count");
	}
}
public class Interface3 {
	public static void main(String[] args) {
		Ca obj1=new Ca();
		obj1.count();
	}
}