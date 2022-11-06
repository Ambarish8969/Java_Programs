package Hello;
import java.util.*;
public class Pg {
	
	static String pg_name="PG Chegus Perennial";
	int sharings=1;
	int rent=5000;
	int vacant_rooms=10;
	
	public void getDetails() {
			System.out.println(pg_name);
			System.out.println(sharings+" Sharing");
			System.out.println("rent "+rent);
			System.out.println("vacant_rooms : "+vacant_rooms);
	}
	public void getVacantrooms(int rent1) {
		if(rent1==rent) {
			vacant_rooms--;
			if(vacant_rooms>0) {
				System.out.println(sharings+" Sharing");
				System.out.println("rent "+rent);
				System.out.println("Present vacant_rooms : "+vacant_rooms);
			}else {
				System.out.println("All rooms are full.");
				System.out.println("No vacant rooms are available.");
			}
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Pg obj=new Pg();
		obj.getDetails();
		for(int i=0;i<10;i++) {
			System.out.print("Please pay the Rent : ");
			int rent1=input.nextInt();
			obj.getVacantrooms(rent1);
		}
		input.close();
	}

}
