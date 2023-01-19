package com.jsp.ArrayList1;

import java.util.ArrayList;

class Employee{
	private String name;
	private int eid;
	private double sal;
	
	public Employee(String name, int eid, double sal) {
		super();
		this.name = name;
		this.eid = eid;
		this.sal = sal;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + ", sal=" + sal + "]";
	}
	
}
public class ArrayList2 {
	public static void main(String[] args) {
		Employee e1=new Employee("Ambarish",456,5000.0);
		Employee e2=new Employee("Mahesh",500,10000.0);
		Employee e3=new Employee("Abhishek",600,15000.0);
		
		ArrayList<Object> a1=new ArrayList<Object>();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("===========================");
		for(Object d:a1) {
			System.out.println(d);
		}
	}
}
