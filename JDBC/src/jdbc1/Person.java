package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.Statement;

public class Person {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mypersondet","root","root");
			Statement statement=connection.createStatement();
//			statement.execute("insert into person values(1,'Nitish',25,'m','nitish@gmail.com')");
			statement.execute("insert into person values(2,'Ambika',23,'f','ambika@gmail.com')");
			statement.execute("insert into person values(3,'Ambarish',23,'m','ambarish@gmail.com')");
			statement.execute("insert into person values(4,'Rakesh',25,'m','rakesh@gmail.com')");
			statement.execute("insert into person values(5,'Mandara',23,'f','mandara@gmail.com')");

			connection.close();
			System.out.println("Person data saved.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
