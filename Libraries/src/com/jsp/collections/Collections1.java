package com.jsp.collections;

class Employee{
	String name;
	int eid;
	double sal;
	
	public Employee(String name,int eid,double sal) {
		this.name=name;
		this.eid=eid;
		this.sal=sal;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + ", sal=" + sal + "]";
	}
	
}
public class Collections1 {
	public void addEmpdetails() {
		Employee e1=new Employee("a",101,10000.0);
		Employee e2=new Employee("b",102,11000.0);
		Employee e3=new Employee("c",103,12000.0);
		 
		Employee[] empdetails= {e1,e2,e3};
		for(int i=0;i<empdetails.length;i++) {
			System.out.println(empdetails[i]);
		}
	}
	public static void main(String[] args) {
		Collections1 c1=new Collections1();
		c1.addEmpdetails();
	}
}
