package util;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection connection = (Connection) DbUtil.getConnection();
		
		try {
			Statement statement = (Statement) connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from Admin");
			while(resultSet.next()) {
				System.out.println(resultSet.getString("Name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
