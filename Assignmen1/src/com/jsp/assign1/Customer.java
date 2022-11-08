package com.jsp.assign1;

public class Customer {
	String name;
	int id;
	String address;
	
	public Customer(String name,int id,String address) {
		this.name=name;
		this.id=id;
		this.address=address;
	}
	public void getDetails() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(address);
	}
	public static void main(String[] args) {
		Customer obj=new Customer("Mansi",466,"xyz");
		obj.getDetails();
	}
}