package com.jsp.assign1;

public class CustomerLogin {
	String name;
	long phno;
	String email;

	public CustomerLogin(String name,String email) {
		this.name=name;
		this.email=email;
	}
	public CustomerLogin(String name,long phno) {
		this.name=name;
		this.phno=phno;
	}
	public void getDetails() {
		if(phno==0) {
			System.out.println(name);
			System.out.println(email);
		}else {
			System.out.println(name);
			System.out.println(phno);
		}
	}
	public static void main(String[] args) {
		CustomerLogin obj=new CustomerLogin("ambarish",9900408969l);
		obj.getDetails();
	}

}
