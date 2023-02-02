package com.jsp.files;

import java.io.File;

public class CreateFolder {
	public static void main(String[] args) {
		File f=new File("folder1");
		f.mkdir(); // mkdir creates a new folder.
	}
}
