//	Create a class named 'Member' having the following members:
//	Data members
//	1 - Name
//	2 - Age
//	3 - Phone number
//	4 - Address
//	5 - Salary
//	It also has a method named 'printSalary' which prints the salary of the members.
//	Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee'
//  and 'Manager' classes have data members 'specialization' and 'department' 
//	respectively. Now, assign name, age, phone number, address and salary to 
//  an employee and a manager by making an object of both of these classes and print the same.

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
