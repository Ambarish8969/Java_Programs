package Hello;
abstract class Ab{
	public abstract void getName();
}
public class Practive extends Ab {
	
	@Override
	public void getName() {
		System.out.println("ambu");
	}
	public static void main(String[] args) {
		Practive obj=new Practive();
		obj.getName();
	}
}