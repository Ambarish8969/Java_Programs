package com.jsp.youtube;
import com.jsp.youtube.*;

class Library{
	public void downloads() {
		System.out.println("12 downloaded videos");
	}
}
public class Main12 {
	public static void main(String[] args) {
		Home obj1=new Home("ambarish","ambi@00");
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