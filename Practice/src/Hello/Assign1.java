package Hello;
import java.util.Scanner;
public class Assign1 {
	
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int b=input.nextInt();
	
	public void add() {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		new Assign1().add();
		
	}
	
}

