package StudentDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class StudentInterfaceImpl implements StudentInterface {
	Scanner ip=new Scanner(System.in);

	@Override
	public void addStudent() {
		System.out.println("Enter the student id : ");
		int id=ip.nextInt();
		System.out.println("Enter the student name : ");
		String name=ip.next();
		System.out.println("Enter the student age : ");
		int age=ip.nextInt();
		System.out.println("Enter the student marks : ");
		int marks=ip.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("insert into student values(?,?,?,?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setInt(3, age);
			preparedStatement.setInt(4, marks);
			preparedStatement.execute();
			connection.close();
			System.out.println("Data Saved.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteStudent() {
		System.out.println("Enter the student id : ");
		int id=ip.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("delete from student where id=?");
			preparedStatement.setInt(1, id);
			preparedStatement.execute();
			connection.close();
			System.out.println("Data Deleted.");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateStudent() {
		System.out.println("Enter the student id : ");
		int id1=ip.nextInt();
		System.out.println("1:Update Name\n2:Update Age\n3:Update Marks");
		int choice = ip.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter Student name : ");
			String updated_name=ip.next();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
				PreparedStatement preparedStatement=connection.prepareStatement("update student set name=? where id="+id1+" ");
//				PreparedStatement preparedStatement=connection.prepareStatement("update student set name=? where id=? "); 2nd way
				preparedStatement.setString(1, updated_name);
//				preparedStatement.setInt(2, id1); 
				preparedStatement.execute();
				connection.close();
				System.out.println("Name Updated.");
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		case 2:
			System.out.println("Enter Student age : ");
			int updated_age=ip.nextInt();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
				PreparedStatement preparedStatement=connection.prepareStatement("update student set age=? where id="+id1+"");
				preparedStatement.setInt(1, updated_age);
				preparedStatement.execute();
				connection.close();
				System.out.println("Age Updated.");
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		case 3:
			System.out.println("Enter Student marks : ");
			int updated_marks=ip.nextInt();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
				PreparedStatement preparedStatement=connection.prepareStatement("update student set marks=? where id="+id1+"");
				preparedStatement.setInt(1, updated_marks);
				preparedStatement.execute();
				connection.close();
				System.out.println("Marks Updated.");
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void getStudent() {
		System.out.println("Enter the student id : ");
		int id=ip.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("select * from student where id=?");
			preparedStatement.setInt(1, id);
			ResultSet resultset=preparedStatement.executeQuery();
			while(resultset.next()) { 
				System.out.println("Id : "+resultset.getInt(1));
				System.out.println("Name : "+resultset.getString(2));
				System.out.println("Age : "+resultset.getInt(3));
				System.out.println("Marks : "+resultset.getInt(4));
			}
			preparedStatement.execute();
			connection.close();
			System.out.println("Data Printed.");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void getAllStudent() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("select * from student");
			ResultSet resultset=preparedStatement.executeQuery();
			while(resultset.next()) { 
				System.out.println("Id : "+resultset.getInt(1));
				System.out.println("Name : "+resultset.getString(2));
				System.out.println("Age : "+resultset.getInt(3));
				System.out.println("Marks : "+resultset.getInt(4));
			}
			preparedStatement.execute();
			connection.close();
			System.out.println("Data Printed.");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
