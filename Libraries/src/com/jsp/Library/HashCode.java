package com.jsp.Library;

public class HashCode {
	
//	@Override
//	public int hashCode() {
//		return 23;
//	}

	public static void main(String[] args) {
		HashCode h1=new HashCode();
		
// If we override hashCode method it will give updated values.
		System.out.println(h1.hashCode());
		
// If we don't override hashCode method it will give 10 digit 
// code.
		System.out.println(h1.hashCode());
	}

}
