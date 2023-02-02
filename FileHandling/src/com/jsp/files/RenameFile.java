package com.jsp.files;

import java.io.File;

public class RenameFile {
	public static void main(String[] args) {
		File f1=new File("demo.txt");
		File f2=new File("demo1.txt");
		f1.renameTo(f2);
	}
}