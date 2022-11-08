package com.jsp.assign1;

public class Login {
	
	String email;
	long phno;
	String password;
	
	public Login(String email,String password) {
		this.email=email;
		this.password=password;
	}
	public Login(long phno,String password) {
		this.phno=phno;
		this.password=password;
	}
	
	
	public void getDetails() {
		if(phno==0) {
			System.out.println("email id : "+email);
			System.out.println("password : "+password);
		}else {
			System.out.println("phno : "+phno);
			System.out.println("password : "+password);
		}
	}
	
	public static void main(String[] args) {
		Login obj=new Login(9900408969l,"ambi@00");
		obj.getDetails();
	}

}
