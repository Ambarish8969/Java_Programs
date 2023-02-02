package Hello;

import java.io.File;

public class Practice2 {
	public static void main(String[] args) {
//		try {
//			System.out.println(100/0);
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
		File f=new File("ambi.doc");
		f.createNewFile();
	} 
} 