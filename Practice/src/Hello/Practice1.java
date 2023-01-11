package Hello;

class A{
	public void method1() {
		System.out.println("Ambarish 1");
	}
}
class B extends A{
	public void method2() {
		System.out.println("Ambarish 2");
	}
}
class C1 extends B{
	public void method3() {
		System.out.println("Ambarish 3");
	}
}
public class Practice1{
	public static void main(String[] args) {
		C1 c1=new C1();
		c1.method3();
		c1.method2();
		c1.method1();
	}
}