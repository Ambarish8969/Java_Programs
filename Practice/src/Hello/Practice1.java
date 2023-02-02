package Hello;
class Super{
	private int a;
	public int b;

	public Super() {
		this.a=10;
		this.b=20;
	}
	
	public void displayValues() {
		System.out.println(a);
		System.out.println(b);
	}
}
class Sub extends Super{

	public Sub() { 
		super();
//		this.a=100;
		this.b=40;
	}
}
public class Practice1{
	public static void main(String[] args) {
		Sub obj=new Sub();
		obj.displayValues();
	}
}