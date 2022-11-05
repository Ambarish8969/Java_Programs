package com.saturday.test1;

public class Student {
	
	String student_name;
	String student_branch;
	int student_sem;
	int student_marks;
	
	public Student(String student_name,String student_branch,int student_sem,int student_marks) {
		this.student_name=student_name;
		this.student_branch=student_branch;
		this.student_sem=student_sem;
		this.student_marks=student_marks;
	}
	
	public void checkDetails() {
		if((this.student_branch=="CS") || (this.student_branch=="IS") || 
				(this.student_branch=="EC") || (this.student_branch=="EEE")) {
			System.out.println("Yes");
		}else {
			System.out.println("Not a Student.");
		}
	}

	public static void main(String[] args) {
		Student obj1=new Student("Mansi","CV",8,95);
		obj1.checkDetails();
		Student obj2=new Student("Divya","CS",6,65);
		obj2.checkDetails();
		Student obj3=new Student("Ambarish","EC",7,99);
		obj3.checkDetails();
	}

}
