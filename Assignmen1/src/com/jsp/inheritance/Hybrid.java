package com.jsp.inheritance;
class Flipkart{
	public void order() {
		System.out.println("order");
	}
}
class Fashion extends Flipkart{
	public void men() {
		System.out.println("men");
	}
	public void women() {
		System.out.println("women");
	}
}
class BrandFashion extends Fashion{
	public void jockey() {
		System.out.println("jockey");
	}
	public void puma() {
		System.out.println("puma");
	}
	public void orderDetails(String gender) {
		if(gender=="male"){
			men();
			jockey();
		}else {
			women();
			puma();
		}
	}
}
class Electronics extends Flipkart{
	public void mobile() {
		System.out.println("mobile");
	}
	public void laptop() {
		System.out.println("laptop");
	}
}
class CompanyName extends Electronics{
	public void samsung() {
		System.out.println("samsung mobile");
	}
	public void dell() {
		System.out.println("dell laptop");
	}
	public void orderDetails(String device) {
		if(device=="laptop") {
			laptop();
			dell();
		}else {
			mobile();
			samsung();
		}
	}
}
public class Hybrid {
	public static void main(String[] args) {
		BrandFashion obj1=new BrandFashion();
		obj1.orderDetails("female");
		System.out.println("============================");
		CompanyName obj2=new CompanyName();
		obj2.orderDetails("mobile");
	}
}