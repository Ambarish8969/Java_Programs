package StudentDB;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		StudentInterface s1=new StudentInterfaceImpl();
		System.out.println("--------Welcome to Student DataBse--------");
		Scanner ip=new Scanner(System.in);
		while(true) {
			System.out.println("1:Add Student\n2:Delete Student\n3:Update Student\n4:Get Student\n5:Get All Student\n6:Exit");
			System.out.println("Enter your choice : ");
			int choice=ip.nextInt();
			switch(choice) {
			case 1:
				new StudentInterfaceImpl();
				s1.addStudent();
				break;
			case 2:
				s1.deleteStudent();
				break;
			case 3:
				s1.updateStudent();
				break;
			case 4:
				s1.getStudent();
				break;
			case 5:
				s1.getAllStudent();
				break;
			case 6:
				System.out.println("Thank You");
				System.exit(0);
			default:
				System.out.println("Invalid Choice.");
			}
			System.out.println("----------------------------------");
		}
	}
}
