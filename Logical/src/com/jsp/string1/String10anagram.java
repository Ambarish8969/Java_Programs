package com.jsp.string1;

// Anagram means length and characters of both strings 
// should be same.
public class String10anagram {
	public static void main(String[] args) {
		String s1="hellom";
		String s2="olehl"; 
		if(s1.length()==s2.length()) {
			char arr1[]=s1.toCharArray();
			char arr2[]=s2.toCharArray();
			for(int i=0;i<s1.length();i++) {
				for(int j=0;j<s1.length();j++) {
					if(arr1[i]==arr2[j]) {
						arr2[j]='\0';
					} 
				}
			}
			System.out.println("Anagram");
		}else {
			System.out.println("Not an Anagram");
		}
	}
}
