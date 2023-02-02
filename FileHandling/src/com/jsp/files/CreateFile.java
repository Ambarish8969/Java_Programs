package com.jsp.files;

import java.io.File;

public class CreateFile {
	public static void main(String[] args) {
		File f=new File("demo.txt");
		// f.createNewFile(); throws an Exception.
		try {
			f.createNewFile();// creates a new file. 
		} 
		catch(Exception e) { 
			e.printStackTrace();
		}
	}
}
