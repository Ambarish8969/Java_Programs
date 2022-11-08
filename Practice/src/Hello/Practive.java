package Hello;

public class Practive {
	
	public Practive() {
		System.out.println("constructor 1");
	}
	public Practive(int a) {
		this();
		System.out.println("constructor 2");
	}
	public Practive(int a,double b) {
		this();
		System.out.println("constructor 3");
	}
	public Practive(double a, int b) {
		this();
		System.out.println("constructor 4");
	}
	public Practive(int a, int b, int c) {
		this(8.1,5);
		System.out.println("constructor 5");
	}
	
	public static void main(String[] args) {
		Practive obj=new Practive(5,6,8);
		
	}
}
