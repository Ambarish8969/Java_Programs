package com.jsp.string1;

public class Mirror {
	public static void main(String[] args) {
		String s="abccba";
		if(s.length()%2==0) {
			boolean flag=true;
			for(int i=0,j=s.length()-1;i<j;i++,j--) {
				if(s.charAt(i) != s.charAt(j)) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.println("Mirror");
			}else {
				System.out.println("Not a Mirror");
			}
		}else {
			System.out.println("Not a Mirror");
		}
	}
}
