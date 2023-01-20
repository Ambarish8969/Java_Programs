package com.jsp.Arrays;

public class KeyPad {
	public static void main(String[] args) {
		char arr[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},
				{'m','n','o'},{'p','q','r'},{'s','t','u'},{'v','w','x'},
				{'y','z'}};
		String s="hello";
		char arr1[]=s.toCharArray();
		int sum=0;
		for (int i = 0; i < arr1.length; i++) { 
		    for (int j = 0; j < arr.length; j++) { 
		    	for(int k=0;k<arr[j].length;k++) {
		    		if (arr1[i]==arr[j][k]) { 
			            sum=sum+(k+1);
			        }
		    	}
		    }
		}System.out.println(sum);
	}
}