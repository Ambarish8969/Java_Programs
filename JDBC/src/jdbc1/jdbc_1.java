package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc_1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","root");
			Statement statement=connection.createStatement();
			statement.execute("insert into person1 values(102,'Ambika')");
			connection.close();
			System.out.println("Data Stored");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
