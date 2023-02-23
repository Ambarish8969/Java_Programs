package Hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetHospital {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/hospitaldb","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("select * from hospital");
			ResultSet resultset=preparedStatement.executeQuery();
			while(resultset.next()) {
				System.out.println(resultset.getInt(1)+" "+resultset.getString(2)+" "+resultset.getString(3)+" "+resultset.getString(4));
			}
			connection.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
