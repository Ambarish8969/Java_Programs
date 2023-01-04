package com.jsp.string1;

public class String8 {
	public static void main(String[] args) {
		String s="((()))()()(())";
		int count1=0;
		int count2=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='(') {
				count1++;
			}
			if(c==')') {
				count2++;
			}
		}
		if(count1==count2) {
			System.out.println("Balanced");
		}else {
			System.out.println("UnBalanced");
		}
	}

}
