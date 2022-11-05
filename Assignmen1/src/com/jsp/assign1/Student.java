package com.jsp.assign1;

public class Student {
	
	String stu_name;
	int stu_rollno;
	int stu_marks;
	static int stu_class;
	
	// Constructor Initialization.
	public Student(String stu_name,int stu_rollno,int stu_marks,int stu_class) {
		this.stu_name=stu_name;
		this.stu_rollno=stu_rollno;
		this.stu_marks=stu_marks;
		Student.stu_class=stu_class;
	}
	
	public void showStudentDetails() {
		System.out.print(stu_name+" ");
		System.out.print(stu_rollno+" ");
		System.out.print(stu_marks+" ");
		System.out.println(stu_class);
	}

	public static void main(String[] args) {
		Student obj1=new Student("Ambarish",06,99,8);
		Student obj2=new Student("Archana",10,97,7);

		obj1.showStudentDetails();
		obj2.showStudentDetails();

	}

}
