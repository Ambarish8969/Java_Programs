package Hello;

class AadharCard{
	String name ="Ambarish";
	long number=282598971574l;
	
	private static AadharCard ac;
	
	private AadharCard() {
		System.out.println("AadharCard Generated.");
	}
	 
	@Override
	public String toString() {
		return "AadharCard [name=" + name + ", number=" + number + "]";
	}
	
	public static AadharCard getInstance() {
		if(ac==null) {
			ac=new AadharCard();
		}
		return ac;
	}
}
public class Practice2 {
	public static void main(String[] args) throws Exception{
		AadharCard ac=AadharCard.getInstance();
//		System.out.println(ac.name);
//		System.out.println(ac.number);
		System.out.println(ac);// for toString().
	} 
} 