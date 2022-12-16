package com.jsp.logical1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=1635,n1=n,n2=n;
		int c=0;
		while(n!=0) {
			n=n/10;
			c++;
		}
		int rem=0,sum=0;
		while(n1!=0) {
			rem=n1%10;
			int pow=1;
			for(int i=1;i<=c;i++) {
				pow=pow*rem;
			}
			sum=sum+pow;
			n1=n1/10;
		}
		if(n2==sum) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not a Armstrong Number");
		}
	}

}
