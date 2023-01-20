package com.jsp.ArrayList1;

import java.util.ArrayList;
import java.util.Collections;

class Employee1 implements Comparable<Employee1>{
	String ename;
	int eid;
	int sal;
	
	public Employee1(String ename,int eid,int sal) {
		this.ename=ename;
		this.eid=eid;
		this.sal=sal;
	}
	@Override 
	public String toString() {
		return "Employee1 [name : "+ename+", sal : "+sal+"]";
	} 
	@Override
	public int compareTo(Employee1 e){
		return this.eid-e.eid;
	}
}
public class ArrayList3 {
	public static void main(String[] args) { 
		Employee1 e1=new Employee1("Ambarish",56,55000);
		Employee1 e2=new Employee1("Akash",45,10000); 
		
		ArrayList<Employee1> alist=new ArrayList<Employee1>();
		alist.add(e2);
		alist.add(e1);
		Collections.sort(alist);
		System.out.println(alist);
	}
}
