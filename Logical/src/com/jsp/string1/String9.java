package com.jsp.string1;

public class String9 {
	public static void main(String[] args) {
		String s="combination";
		int r=s.length();
		int l=0;
		System.out.println(s); 
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				r--;
			}else {
				l++;
			}
			String s2="";
			for(int j=l;j<r;j++) {
				s2=s2+s.charAt(j);
			}
			System.out.println(s2);
		}
	}
}
