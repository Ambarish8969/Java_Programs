package com.jsp.logical1;

import java.util.Scanner;

public class Calci {
	static void add(int a,int b) {
		System.out.println(a+b);
	}
	static void sub(int a,int b) {
		System.out.println(a-b);
	}
	static void mul(int a,int b) {
		System.out.println(a*b);
	}
	static void div(int a,int b) {
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("=======welcome to my calci========");
		while(true) {
			System.out.println("===menu===");
			System.out.println("1.add \n2.sub\n3.mul\n4.div\n5.mod\n6.exit");
			System.out.println("====please enter your choice====");
			int a=50,b=20;
			int choice=input.nextInt();
			switch(choice) {
			case 1:add(a,b);
			break;
			case 2:sub(a,b);
			break;
			case 3:mul(a,b);
			break;
			case 4:div(a,b);
			break;
			case 6:System.exit(0);
				System.out.println("Terminated");
			} 
		}	
	}

}
