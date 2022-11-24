package com.saturday.test3;

class Shopping{
	String productName;
	String productId;
	double productPrice;
	
	public void orderProduct(String productName,double productPrice) {
		if(productPrice>5000) {
			productPrice=productPrice-1000;
			System.out.println("Total Price : "+ productPrice);
			System.out.println("Order Placed");
		}else {
			System.out.println("Total Price : "+ productPrice);
			System.out.println("Order Placed");
		}
	}
}
class Mobile extends Shopping{
	
}
public class MainShopping {

	public static void main(String[] args) {
		Mobile obj1=new Mobile();
		obj1.orderProduct("Samsung",6000);
		obj1.orderProduct("Nokia",10000);
	}

}
