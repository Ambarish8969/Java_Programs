package com.jsp.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args) throws Exception {
		File f=new File("demo2.txt");
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter(f);
//			fw.write("hii ambi 2");
//			fw.flush();
//			System.out.println("Data stored");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally { 
//			try {
//				fw.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		FileWriter fw=new FileWriter(f);
		fw.write("using throws");
		fw.flush();
		fw.close();
		System.out.println("Data Stored");
	}
}
