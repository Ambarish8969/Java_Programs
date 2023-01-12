package com.jsp.string1;

// Make big number using given number.
public class String12 {
	public static void main(String[] args) {
		int n=5391;
		int n1=n;
		int size=0;
		while(n1!=0) {
			n1=n1/10;
			size++;
		}
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=n%10;
			n=n/10;
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			//System.out.print(arr[i]);
		}
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			ans=(ans*10)+arr[i];
		}
		System.out.println(ans);
	}
}
