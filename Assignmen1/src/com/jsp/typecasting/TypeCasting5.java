package com.jsp.typecasting;
class User{
	
}
class Customer extends User{
	public void buyProduct() {
		System.out.println("buy product");
	}
	public void cancleProduct() {
		System.out.println("cancel order");
	}
}
class Admin extends User{
	public void addProduct() {
		System.out.println("add product");
	}
	public void removeProduct() {
		System.out.println("removed product");
	}
}
class LoginPage{
	public void login(User u) {
		if(u instanceof Customer) {
			Customer c1=(Customer)u;// DownCasting.
			System.out.println("Customer loggedIn");
			c1.buyProduct();
			c1.cancleProduct();
		}else {
			Admin a1=(Admin)u;
			System.out.println("Admin loggedIn");
			a1.addProduct();
			a1.removeProduct();
		}
	}
}
public class TypeCasting5 {
	public static void main(String[] args) {
		Customer c1=new Customer();
		Admin a1=new Admin();
		LoginPage l1=new LoginPage();
		l1.login(a1);
		l1.login(c1);
	}
}