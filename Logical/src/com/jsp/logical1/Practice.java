package com.jsp.logical1;

public class Practice {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				for(int j=1;j<=i;j++) {
					System.out.print(j+" ");
				}System.out.println();
			}else {
				for(char c=65;c<=i;c++) {
					System.out.print(c+" ");
				}System.out.println();
			}
		}
	}
}