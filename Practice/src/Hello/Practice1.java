package Hello;

public class Practice1{
	
	static int a=10;
	public void add() {
		int a=20;
		System.out.println(a);
		System.out.println(this.a);
	}
	
	public static void main(String[] args) {
		Practice1 p1=new Practice1();
		p1.add();
		
		int b=1234567891;
		System.out.println(b);
	}
}