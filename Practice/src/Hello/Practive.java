package Hello;

public class Practive {
	
	public void showDetails(String name,int id) {
		System.out.println(name);
		System.out.println(id);
	}
	
	public static void main(String[] args) {
		Practive obj=new Practive();
		obj.showDetails("Ambarish", 1546);
		obj.showDetails("Archana",8979);
	}
}
