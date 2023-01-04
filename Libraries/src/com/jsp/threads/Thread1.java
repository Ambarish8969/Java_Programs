package com.jsp.threads;

public class Thread1 extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Thread1 obj1=new Thread1();
		obj1.start();
	}

}
