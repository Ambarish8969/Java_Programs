package com.jsp.typecasting;
class Sample{
	
}
class Demo extends Sample{
	
}
class Demo1 extends Sample{
	
}
public class TypeCasting4 {
	public void test(Sample d) {
		System.out.println("hii");
	}
	public void test(Demo1 d3) {  
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Sample s1=new Sample();
		Demo d1=new Demo();
		Demo1 d2=new Demo1();
		TypeCasting4 t1=new TypeCasting4();
		t1.test(d2);
		t1.test(s1);
		t1.test(d1);
	}
}