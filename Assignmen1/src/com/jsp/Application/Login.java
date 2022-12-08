package com.jsp.Application;

public class Login {
	String username;
	String password;
	
	public Login(String username,String password) {
		this.username=username;
		this.password=password;
	}
	public void login() {
		if(username=="ambarish") {
			if(password=="ambi@00") {
				System.out.println("Successfully loggedIn");
				
			}else {
				System.out.println("Invalid Password");
			}
		}else {
			System.out.println("Invalid Username");
		}
	}
}
