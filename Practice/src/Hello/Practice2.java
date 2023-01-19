package Hello;

class User{
	String name="Ambarish";
	int sal=500;
	
	@Override
	public String toString() {
		return "[Name : "+name+", sal : "+sal+"]"; 
	} 
	
}
public class Practice2 {
	public static void main(String[] args) {
		User u1=new User();
		System.out.println(u1);
	} 
} 