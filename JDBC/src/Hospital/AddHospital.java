package Hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddHospital {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/Hospitaldb","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("insert into hospital values(?,?,?,?)");
			preparedStatement.setInt(1, 102); 
			preparedStatement.setString(2, "Ambika"); 
			preparedStatement.setString(3, "www.yyy.com"); 
			preparedStatement.setString(4, "Ankola"); 
			preparedStatement.execute();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
