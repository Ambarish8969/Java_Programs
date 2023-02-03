package com.jsp.string1;

public class LongestPalindrome {
	static boolean palindrome(String s) {
		String s2="";
		for(int i=0;i<s.length();i++) {
			s2=s.charAt(i)+s2;
		}
		return s2.equalsIgnoreCase(s);
	}
	public static void main(String[] args) {
		String s="abacddddddcaabbbaac";
		String ans=s.charAt(0)+"";
		for(int i=0;i<s.length();i++) {
			String temp=""+s.charAt(i);
			for(int j=i+1;j<s.length();j++) {
				temp=temp+s.charAt(j);
				if(palindrome(temp)) {
					if(ans.length()<temp.length()) {
						ans=temp;
					}
				}
			}
		}System.out.println(ans);
	}
}
