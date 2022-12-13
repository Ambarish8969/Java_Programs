package com.jsp.logical1;

public class Practice {
	public static void main(String[] args) {
		int n=153,c=0,rem=0,sum=0;
		int pow=1,temp=n,n1=n;
		while(n!=0) {
			n=n/10;
			c++;
		}
		System.out.println(c);
		System.out.println(n1);
		while(n1!=0) { 
			rem=n1%10; 
			for(int i=1;i<=c;i++) {
				pow=pow*rem;
				sum=sum+pow;
			}
		}
		System.out.println(sum); 
		if(temp==sum) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not Armstrong Number");
		}
	}
}