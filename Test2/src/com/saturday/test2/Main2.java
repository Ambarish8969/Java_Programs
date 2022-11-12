package com.saturday.test2;

class Jspiders{
	String jspiders_branch="Basavanagudi";
	public void displayBranch() {
		System.out.println(jspiders_branch);
	}
}
class Student extends Jspiders{
	String studentName;
	String studentDegree;
	String degreeStream;
	int degreeYOP;
	
	public Student(String studentName,String studentDegree,String degreeStream,int degreeYOP) {
		this.studentName=studentName;
		this.studentDegree=studentDegree;
		this.degreeStream=degreeStream;
		this.degreeYOP=degreeYOP;
	}
	public void studentDetails() {
		System.out.println(studentName);
		System.out.println(studentDegree);
		System.out.println(degreeStream);
		System.out.println(degreeYOP);
	}
}
public class Main2 {
	public static void main(String[] args) {
		Student obj=new Student("Ambarish","BE","ECE",2022);
		obj.studentDetails();
		obj.displayBranch();
	}

}
