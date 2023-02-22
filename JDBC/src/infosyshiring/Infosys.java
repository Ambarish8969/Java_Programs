package infosyshiring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Infosys {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring","root","root");
			Statement statement= connection.createStatement();
			String name="infosysemp";
			
			ResultSet resultset=statement.executeQuery("select * from "+name+" where phno like '99%' and gender='m'");
			while(resultset.next()) {
				System.out.println(resultset.getString(2));
			}
			connection.close();
			System.out.println("Data Saved");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
