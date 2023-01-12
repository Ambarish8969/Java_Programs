package com.jsp.regex;

public class Regex2 {
	public static void main(String[] args) {
		String s="256.70.128.200";
		String arr[]=s.split("[.]"); 
		boolean flag=true;
		for(String ele:arr) {
			int n=Integer.parseInt(ele);
			if(n<0 || n>255) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("Valid IP");
		}
		else {
			System.out.println("Invalid IP");
		}
	}
}
