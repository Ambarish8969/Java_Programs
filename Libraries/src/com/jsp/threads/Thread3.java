package com.jsp.threads;

class Sample1 implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		} 
	}
}
public class Thread3 {
	public static void main(String[] args) {
		Sample1 s1=new Sample1();
		Thread t1=new Thread(s1);
		t1.start();
	}
}
