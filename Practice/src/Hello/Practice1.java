package Hello;

public class Practice1{
	public int hashCode() {
		return 456;
	}
	public String toString() {
		return "Ambika";
	}
//	
	public static void main(String[] args) {
		Practice1 p1=new Practice1();
		String s1=new String("Ambarish");
		String s2="ambi";
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s1.hashCode());
		System.out.println(p1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(p1.toString());
	}
}