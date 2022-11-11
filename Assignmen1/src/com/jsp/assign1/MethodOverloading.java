package com.jsp.assign1;

public class MethodOverloading {
	
	public void drawpoints(int x,int y) {
		System.out.println(x+" "+y);
	}
	protected static int drawpoints(int x,double y) {
		System.out.println(x+" "+y);
		return 1;
	}
	void drawpoints(double x,int y) {
		System.out.println(x+" "+y);
	}
	private void drawpoints(double x,double y) {
		System.out.println(x+" "+y);
	}
	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.drawpoints(1, 1);
		MethodOverloading.drawpoints(2, 2.5);
		obj.drawpoints(2.5, 3);
		obj.drawpoints(3.5, 4.2);
	}

}
