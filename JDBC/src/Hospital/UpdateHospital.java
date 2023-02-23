package Hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateHospital {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/Hospitaldb","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("update hospital set location=? where id=102");
//			preparedStatement.setString(1, "Ambi");
			preparedStatement.setString(1,"Banglore");
			preparedStatement.execute();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
