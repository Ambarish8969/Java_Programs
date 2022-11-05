package com.jsp.assign1;

public class Employee {
	String emp_name;
	int emp_salary;
	int emp_id;
	
	public Employee(String emp_name,int emp_salary,int emp_id) {
		this.emp_name=emp_name;
		this.emp_salary=emp_salary;
		this.emp_id=emp_id;
	}
	
	public void showEmployeeDetails() {
		System.out.println(emp_name);
		System.out.println(emp_salary);
		System.out.println(emp_id);
	}

	public static void main(String[] args) {
	
		Employee obj=new Employee("Ambarish",55000,4655);
		obj.showEmployeeDetails();

	} 

}
