package com.jsp.files;

import java.io.File;

public class ExistDelete {
	public static void main(String[] args) {
		File f=new File("demo.txt");
		System.out.println(f.exists());
		if(f.exists()) {
			f.delete();
			System.out.println("File Deleted Successfully");
		}else{
			System.out.println("File Not Present");
		}
	}
}
