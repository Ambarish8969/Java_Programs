package com.jsp.string1;

public class Practice1 {
	public static void main(String[] args) {
		String s="hello 690 bye 10 hi 600";
		String arr[]=s.split(" ");
		int sum=0;
		for(String ele:arr) {
			if(ele.charAt(0)>='0' && ele.charAt(0)<='9') {
				sum=sum+Integer.parseInt(ele);
			}
		}
		System.out.println(sum);
	}
}