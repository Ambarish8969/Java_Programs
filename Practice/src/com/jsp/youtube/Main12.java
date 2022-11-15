package com.jsp.youtube;

class Home{
	String username="ambarish";
	private String password="ambi@00";
	static String userchoice;

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
	public void setUserChoice(String userchoice) {
		Home.userchoice=userchoice;
	}
	public String getUserChoice() {
		return userchoice;
	}
}
class Subscriptions extends Home{
	public void lists() {
		if(getUserChoice()=="subscriptions") {
			System.out.println("Getting your subscriptions....");
			System.out.println("Telusko");
			System.out.println("HackerRank");
			System.out.println("Bhuvan Bum");
		}else {
			System.out.println("Invalid choice");
		}
	}
}
class Library{
	public void downloads() {
		System.out.println("12 downloaded videos");
	}
}
public class Main12 {
	public static void main(String[] args) {
		Home obj1=new Home();
		obj1.login();
		obj1.wish();
		obj1.setUserChoice("subscriptions");
		System.out.println("=========================");
		Subscriptions obj2=new Subscriptions();
		obj2.lists();
		System.out.println("=========================");
		Library obj3=new Library();
		obj3.downloads();
	}
}