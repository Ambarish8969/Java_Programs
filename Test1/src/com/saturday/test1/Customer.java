package com.saturday.test1;

public class Customer {
	
	String customer_name;
	int customer_id;
	String customer_password;
	
	public Customer(String customer_name,int customer_id,String customer_password) {
		this.customer_name=customer_name;
		this.customer_id=customer_id;
		this.customer_password=customer_password;
	}
	
	public void displayCustomerDetails() {
		System.out.println("Customer Name : "+customer_name);
		System.out.println("Customer Id : "+customer_id);
		System.out.println("Customer Password : "+customer_password);
	}

	public void orderProduct(String product) {
		
		System.out.println("Product Orderd : "+product);
	}
	
	public static void main(String[] args) {
		Customer obj=new Customer("Ambarish",4567,"ambi@00");
		obj.displayCustomerDetails();
		obj.orderProduct("Samsung Mobile");

	}

}
