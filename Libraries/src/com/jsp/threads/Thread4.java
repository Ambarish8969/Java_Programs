package com.jsp.threads;

class Sample12 extends Thread{
	@Override 
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
}
public class Thread4 extends Thread {
	@Override
	public void run() {
		for(int i=4;i>=0;i--) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Sample12 s1=new Sample12();
		Thread4 p1=new Thread4();
		s1.start();
		//System.out.println("-----------------------------");
		p1.start();
		//System.out.println("-----------------------------");
		//obj1.method2();
	}
}