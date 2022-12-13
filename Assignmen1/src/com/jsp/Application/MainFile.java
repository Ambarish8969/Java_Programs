package com.jsp.Application;

public class MainFile {

	public static void main(String[] args) {
		Service s1=new Service();
		Atm a1=new Atm();
		User u1=s1.creatObject(1234,2);
		u1.transaction(1000, 1);
		u1.transaction(200, 2);
	}
}