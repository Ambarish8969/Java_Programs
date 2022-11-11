package com.jsp.inheritance;
class Member{
	String name;
	int age;
	long phno;
	String address;
	double salary;
	
	public void printSalary() {
		System.out.println(salary);
	}
}
class Employee extends Member{
	String specilisation;
}
class Manager extends Member{
	String department;
}
public class Inheritance2 {

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.name="ambarish";
		obj.age=23;
		obj.phno=9900408969l;
		obj.address="Benglore";
		obj.salary=55000;
		obj.printSalary();
	}

}
