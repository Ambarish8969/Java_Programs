package Hello;
interface Super{
	public void test1();
}
class A implements Super{
	@Override
	public void test1() {
		System.out.println("Hii");
	}
}
public class Practice1 extends A {
	@Override
	public void test1() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Practice1 p1=new Practice1();
		p1.test1();
	}
}