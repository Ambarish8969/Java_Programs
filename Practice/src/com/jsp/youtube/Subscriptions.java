package com.jsp.youtube;
import com.jsp.youtube.*;

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
