package Hello;

class Assign2{
	int a=100;
	static int b=200;
	int result=a+b;
	void add() {
		System.out.println(result);
	}
}

public class Assign1 {
	static int c=10;
	int d=30;
	public static void main(String[] args) {
		System.out.println( Assign1.c);
		System.out.println(new Assign2().a);
		System.out.println(Assign2.b);
		System.out.println(new Assign1().d);
		
	}
	
}

