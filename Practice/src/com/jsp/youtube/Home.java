package com.jsp.youtube;
import com.jsp.youtube.*;

class Home{
	String username;
	String password;
	
	public Home(String username,String password) {
		this.username=username;
		this.password=password;
	}
	
	public void login() {
		if(username=="ambarish") {
			if(password=="ambi@00") {
				System.out.println("Successfully loggedin");
			}else {
				System.out.println("Invalid password");
			}
		}else {
			System.out.println("Invalid username");
		}
	}
	public void wish() {
		System.out.println("Welcome "+username);
		homeDisplay();
	}
	public void homeDisplay() {
		System.out.println("Select your choice...");
		System.out.println("Videos");
		System.out.println("Subscriptions");
		System.out.println("Library");
	}
}
