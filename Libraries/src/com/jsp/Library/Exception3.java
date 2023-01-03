package com.jsp.Library;

// For Checked Exception.
public class Exception3 {
	public static void check() throws Exception { // For checked exception  "throws" is mandatory explicitly.
		throw new Exception();	
	}
	public static void main(String[] args) throws Exception{ // For checked exception  "throws" is mandatory explicitly.
		check();
	}
}
