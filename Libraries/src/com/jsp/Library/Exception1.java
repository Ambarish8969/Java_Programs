package com.jsp.Library;

public class Exception1 {
	public static void check(int a) {
		try {
			int res=1000/a;
			System.out.println(res);
			int arr[]= {1,2,3};
			System.out.println(arr[a]);
		}
		catch(ArithmeticException a1){
			System.out.println("Invalid Input a");
		} 
		catch(Exception a2){
			System.out.println("Invalid Input b");
		}
		finally {    
			System.out.println("Finally Executed.");
		}
//		int res=1000/a;
//		System.out.println(res);
	}

	public static void main(String[] args) {
		check(1);
		System.out.println("-----------");
		check(0); 
		System.out.println("-----------");
		check(20);
	}
}