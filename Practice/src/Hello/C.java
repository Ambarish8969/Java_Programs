package Hello;

class A{
	static int a=5;
	public static void count() {
		System.out.println("count()");
	}
}

class B{
	int a=100;
	int b=50;
	int result=a+b;
	void sub() {
		System.out.println(result);
	}
}
public class C {

	public static void main(String[] args) {
		new B().sub();
		System.out.println(new B().a);
		System.out.println(new B().b);
	}

}