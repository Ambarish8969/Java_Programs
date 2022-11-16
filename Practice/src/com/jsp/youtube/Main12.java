package com.jsp.youtube;

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
class Subscriptions extends Home{
	public Subscriptions() {
		super("ambarish@g.com","ambi@00");
	}
	public void lists(String userchoice) {
		if(userchoice=="subscriptions") {
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
		Home obj1=new Home("ambarish@g.com","ambi@00");
		obj1.login();
		obj1.wish();
		System.out.println("=========================");
		Subscriptions obj2=new Subscriptions();
		obj2.lists("subscriptions");
		System.out.println("=========================");
		Library obj3=new Library();
		obj3.downloads();
	}
}