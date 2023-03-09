package Hello;


public class Practice {
	
	public static void check(int n) {
		try {
			int n1=1000/n;
			System.out.println(n1);
			int arr[]= {1,2,3};
			System.out.println(arr[n]);
		}
		catch(Exception e) {
			System.out.println("Invalid inputs");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		check(2);
		check(4);
		check(0);
	}
}
