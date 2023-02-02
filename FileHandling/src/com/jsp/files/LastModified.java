package com.jsp.files;

import java.io.File;
import java.util.Date;

public class LastModified {
	public static void main(String[] args) {
		File f=new File("demo1.txt");
		System.out.println(f.lastModified()); // it prints in miliseconds.
		
		Date d=new Date(f.lastModified()); // it prints date and time
		System.out.println(d); 
		
		System.out.println(new Date(f.lastModified()));
	}
}