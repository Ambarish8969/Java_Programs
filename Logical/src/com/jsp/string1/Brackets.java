package com.jsp.string1;

public class Brackets {
	public static void main(String[] args) {
		String s="()()()()()()";
		char[] arr=s.toCharArray();
		int c=0;
		if(arr.length %2==0) {
			for(int i=0;i<arr.length;i++){
				if(arr[i]=='(') {
					for(int j=i+1;j<arr.length;j++) {
						if(arr[j]==')') {
							arr[i]='\0';
							c++;
						}
					}
				}
			} 
		}
		if(c==s.length()/2 && s.length()%2==0) {
			System.out.println("Balanced Pairs");
		}else {
			System.out.println("Unbalanced Pairs");
		}
	}
}