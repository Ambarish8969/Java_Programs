package com.jsp.threads;

class Sample extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Sample.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Thread2 {
	public static void main(String[] args) {
		Sample obj=new Sample(); 
		obj.start();
	}
}
