package com.saturday.test2;

public class ConstructorOver {
	String email;
	long phno;
	String password;

	public ConstructorOver(String email,String password) {
		this.email=email;
		this.password=password;
	}
	public ConstructorOver(long phno,String password) {
		this.phno=phno;
		this.password=password;
	}
	public void getDetails() {
		if(phno==0) {
			System.out.println(email);
			System.out.println(password);
		}else {
			System.out.println(phno);
			System.out.println(password);
		}
	}

	public static void main(String[] args) {
		ConstructorOver obj=new ConstructorOver("ambarish@gmail.com","ambi@00");
		obj.getDetails();
		System.out.println("=====================");
		ConstructorOver obj1=new ConstructorOver(9900408969l,"ambi@123");
		obj1.getDetails();
	}

}
