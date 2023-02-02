package com.jsp.files;

import java.io.File;
import java.util.Date;

public class LastModified {
	public static void main(String[] args) {
		File f=new File("demo1.txt");
		System.out.println(f.lastModified()); // it prints in miliseconds.
		
		Date d=new Date(f.lastModified());
		System.out.println(d);
		
	}
}