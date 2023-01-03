package com.jsp.Library;

//import java.io.File;
//import java.io.FileInputStream;

class Car extends Exception{
	public Car(String message) {
		super(message);
	}
	public void checked() throws Car{
		throw new Car("wasted");
	}
//	private static void checkedExceptionWithThrows() throws FileNotFoundException  {
//	    File file = new File("not_existing_file.txt");
//	    FileInputStream stream = new FileInputStream(file);
//	}
}
public class Exception2 {
	public static void main(String[] args) {
		Car c1=new Car("a");
		try {
			c1.checked();
		}
		catch(Car e) {
			e.printStackTrace();
		}
	}
}