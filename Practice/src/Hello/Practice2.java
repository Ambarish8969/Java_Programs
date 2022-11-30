package Hello;

public class Practice2 {
	
	// Type Casting.Widening and Narrowing
	public static void test(long a) {
		System.out.println(a);
	}
	public static void test2(int b) {
		System.out.println(b);
	}
	public static void main(String[] args) {
		// Widening -> Low data type to High data type
		byte a=1;
		test(a);
		// Narowing -> High data type to low data type
		long b=46;
		test2((int)b);
	}
}